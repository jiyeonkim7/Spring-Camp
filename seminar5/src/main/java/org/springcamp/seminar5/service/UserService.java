package org.springcamp.seminar5.service;

import org.springcamp.seminar5.dto.User;
import org.springcamp.seminar5.mapper.UserMapper;
import org.springcamp.seminar5.model.DefaultRes;
import org.springcamp.seminar5.utils.ResponseMessage;
import org.springcamp.seminar5.utils.StatusCode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserMapper userMapper;

    /**
     * UserMapper 생성자 의존성 주입
     *
     * @param userMapper
     */
    public UserService(final UserMapper userMapper) {

        this.userMapper = userMapper;
    }

    /**
     * 모든 회원 조회
     *
     * @return DefaultRes
     */
    public DefaultRes findAll() {

        final List<User> userList = userMapper.selectAll();

        if (userList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.FOUND_USER, userList);
    }

    /**
     * 이름으로 회원 조회
     *
     * @param name 이름
     * @return DefaultRes
     */
    public DefaultRes findByName(final String name) {

        final User user = userMapper.selectByName(name);

        if (user == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.FOUND_USER, user);
    }

    /**
     * 회원 가입
     *
     * @param user 회원 데이터
     * @return DefaultRes
     */
    @Transactional
    public DefaultRes save(final User user) {
        try {

            userMapper.insert(user);

            return DefaultRes.res(StatusCode.CREATED, ResponseMessage.SAVE_USER);
        } catch (Exception e) {

            // Rollback
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }

    /**
     * 회원 정보 수정
     *
     * @param userIdx 회원 고유 번호
     * @param user    수정할 회원 데이터
     * @return DefaultRes
     */

    @Transactional
    public DefaultRes update(final int userIdx, final User user) {

        User temp = userMapper.selectByUserIdx(userIdx);

        if (temp == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        try {
            if (user.getName() != null) temp.setName(user.getName());
            if (user.getPart() != null) temp.setPart(user.getPart());
            userMapper.update(userIdx, temp);

            return DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.UPDATE_USER);
        } catch (Exception e) {

            // Rollback
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }

    /**
     * 회원 탈퇴
     *
     * @param userIdx 회원 고유 번호
     * @return DefaultRes
     */
    @Transactional
    public DefaultRes deleteByUserIdx(final int userIdx) {

        final User user = userMapper.selectByUserIdx(userIdx);

        if (user == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        try {
            userMapper.deleteByUserIdx(userIdx);
            return DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.DELETE_USER);
        } catch (Exception e) {

            // Rollback
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }
}