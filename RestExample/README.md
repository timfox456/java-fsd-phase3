# Rest Example

### Testing the service

#### Curl:

```bash
curl -X POST localhost:8090/users  -H 'Content-type:application/json' -d '{"name":"Mary2", "email":"mary2@gmail.com", "password":"password"}'
```

#### Postman: 
1. Create a new POST
2. URL is localhost:8090/users
3. Select "Body" -> "Raw"
4. Paste in the following JSON:

```json
{
    "name": "Mary2",
    "email": "mary2@gmail.com",
    "password": "password"
}
```
