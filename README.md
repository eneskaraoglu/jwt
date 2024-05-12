This pring boot project has basic Spring Security JWT Authentication & Authorization

http://localhost:8080/rest/home

first get the token;

REQUEST;

http://localhost:8080/rest/auth/login

curl --location 'http://localhost:8080/rest/auth/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email":"ek@mail.com",
    "password":"123456"
}'

RESPONSE;

{
    "email": "ek@mail.com",
    "password": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJla0BtYWlsLmNvbSIsImV4cCI6MTkzMTU0ODQ4MX0.PsMZtBXBUm1NJj22m6nHkwA0nBhVj_mNQ0GqiUEeWRU"
}

AND REQUEST WITH TOKEN;

curl --location 'http://localhost:8080/rest/home' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJla0BtYWlsLmNvbSIsImV4cCI6MTkzMTU0ODQ4MX0.PsMZtBXBUm1NJj22m6nHkwA0nBhVj_mNQ0GqiUEeWRU'