# MicroservicesSamples
For microservices samples in different languages

Path variables are very important as they are part of rest endpoint.

> POST /users  
> DELETE /users/1  
> GET /users  
> GET /users/1

to retrieve posts, there can't be posts without users
> GET /users/1/posts

```
 curl -X POST http://localhost:8080/users -d'{"firstName":"AD"}' -H'Content-Type:application/json'
```

## JWT
- why JWT over session token
- sent over to server in header and for authorization
- session token is kept at server but make sense only in monoliths
- JWT contains value signed by server with it secret so client keeps it
- base64 encoded strings separated by '.', having header, payload and signature

# api gw
- api composition where need data from more than one microservice
- can be used for common activities like monitoring, auth




