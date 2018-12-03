# [Pokemon 도감] 

1. 포켓몬 도감 서비스의 URI/API를 설계한다.
2. 포켓몬 도감은 CRUD 기능을 가지고 있다.
3. 모든 속성값은 자유이다.
4. 모두 마크다운 문법으로 파일을 작성한다.
5. API 문서에서 모든 상황을 가정하고 작성한다. (포켓몬이 존재하지 않을 때, DB 에러 시 등등)

---



# URI

| 메소드 | 경로                      | 설명                           |
| ------ | ------------------------- | ------------------------------ |
| GET    | /pokemons                 | 포켓몬 전체 조회               |
| GET    | /pokemons/{pokemon_id}    | 포켓몬 상세 조회               |
| PUT    | /pokemons/{pokemon_id}    | 포켓몬 정보 수정               |
| DELETE | /pokemons/{pokemon_id}    | 포켓몬 삭제                    |
| GET    | /users/{user_id}/pokemons | user에 등록된 포켓몬 전체 조회 |
| POST   | /users/{user_id}/pokemons | user에 포켓몬 등록             |





# API



### 1. 전체 포켓몬 조회

| 메소드 | 경로      | 설명             |
| ------ | --------- | ---------------- |
| GET    | /pokemons | 전체 포켓몬 조회 |



### - 요청 헤더

```json
{
	Content-Type: application/json
}
```

### 

###  - 응답 바디

#### 조회 성공

```json
{
   "status" : 200,
   "message" : "success",
   "result" : [
    {
    	"pokemon_id" : 1,
    	"name" : "망나뇽",
    	"type" : "드래곤",
    	"photo" : "235u843u6034.jpg"
    },
    {
    	"pokemon_id" : 2,
    	"name" : "파이리",
    	"type" : "몰라",
    	"photo" : "23u6034.jpg"
    },
   				 .
   				 .
    			 .
	]
}
```
#### 조회 실패

```json
{
   "status" : 400,
   "message" : "error!",
   "result" : null
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!",
   "result" : null
}  
```



---



### 2. 포켓몬 상세 조회

| 메소드 | 경로                   | 설명             |
| ------ | ---------------------- | ---------------- |
| GET    | /pokemons/{pokemon_id} | 포켓몬 상세 조회 |



### - 요청 헤더

```json
{
	Content-Type: application/json
}
```

### 

###  - 응답 바디

#### 조회 성공

```json
{
   "status" : 200,
   "message" : "success",
   "result" : 
    {
    	"name" : "망나뇽",
    	"type" : "드래곤",
    	"photo" : "235u843u6034.jpg",
    	"weight" : "8kg",
    	"size" : "0.81m"
    }
}
```
#### 조회 실패

```json
{
   "status" : 400,
   "message" : "error!",
   "result" : null
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!",
   "result" : null
}  
```


---



### 3. 포켓몬 정보 수정

| 메소드 | 경로                   | 설명             |
| ------ | ---------------------- | ---------------- |
| PUT    | /pokemons/{pokemon_id} | 포켓몬 정보 수정 |



### - 요청 헤더

```json
{
	Content-Type: multipart/form-data
}
```

### - 요청 바디

```json
{
	"name" : "망나뇽",
    "type" : "드래곤",
    "photo" : "235u843u6034.jpg",
    "weight" : "8kg",
    "size" : "0.84m"
}
```



###  - 응답 바디

#### 수정 성공

```json
{
   "status" : 200,
   "message" : "success"
}
```
#### 수정 실패

```json
{
   "status" : 400,
   "message" : "error!"
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!"
}  
```


---



### 4. 포켓몬 삭제

| 메소드 | 경로                   | 설명        |
| ------ | ---------------------- | ----------- |
| DELETE | /pokemons/{pokemon_id} | 포켓몬 삭제 |



### - 요청 헤더

```json
{
	Content-Type: multipart/form-data
}
```

### 

###  - 응답 바디

#### 삭제 성공

```json
{
   "status" : 204,
   "message" : "success"
}
```
#### 삭제 실패

```json
{
   "status" : 400,
   "message" : "error!"
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!"
}  
```



---



### 3. user에 등록된 포켓몬 조회

| 메소드 | 경로                      | 설명                      |
| ------ | ------------------------- | ------------------------- |
| GET    | /users/{user_id}/pokemons | user에 등록된 포켓몬 조회 |



### - 요청 헤더

```json
{
	Content-Type: application/json
}
```

### 

### - 응답 바디

#### 조회 성공

```json
{
   "status" : 200,
   "message" : "success",
   "result" : 
    [
    {
    	"pokemon_id" : 1,
    	"name" : "망나뇽",
    	"type" : "드래곤",
    	"photo" : "235u843u6034.jpg"
    },
    {
    	"pokemon_id" : 2,
    	"name" : "파이리",
    	"type" : "몰라",
    	"photo" : "23u6034.jpg"
    },
   				 .
   				 .
    			 .
	]
}
```

#### 조회 실패

```json
{
   "status" : 400,
   "message" : "error!",
   "result" : null
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!",
   "result" : null
}  
```



------



### 4. user에 포켓몬 등록

| 메소드 | 경로                      | 설명               |
| ------ | ------------------------- | ------------------ |
| POST   | /users/{user_id}/pokemons | user에 포켓몬 등록 |



### - 요청 헤더

```json
{
	Content-Type: application/json, multipart/form-data
    Application: token,
}
```

### - 요청 바디

```json
{
	"name" : "망나뇽",
    "type" : "드래곤",
    "photo" : "235u843u6034.jpg",
    "weight" : "8kg",
    "size" : "0.84m"
}
```



### - 응답 바디

#### 등록 성공

```json
{
   "status" : 201,
   "message" : "success"
}
```

#### 등록 실패

```json
{
   "status" : 400,
   "message" : "error!"
}  
```

#### DB 에러

```json
{
   "status" : 600,
   "message" : "DB error!"
}  
```



------

