## 🍫 Cacau API 
🌱 API criada em SpringBoot usando design pattern Strategy que retorna uma porcentegem x de cacau para uma maquina de produção

### 🚀 Subindo o servidor:
- para rodar o servidor basta dar o comando run na classe ApiApplication ou usar o comando "mvn spring-boot:run" no root
- o servidor subirá na porta 8080 do localhost

### 🎯  Endpoints
- Método HTTP: GET
- URL: http:// localhost:8080/chocolate/{type}

### 🔗  Parâmetros de URL :

- type (obrigatório): o tipo de chocolate que será fabricado. Os valores possíveis são: A, B ou C.

Resposta de sucesso:
- 200 OK: o percentual de cacau para o tipo de chocolate especificado é retornado.

Resposta de erro:
- 400 Bad Request se o tipo de chocolate especificado for inválido.
- 404 Not Found se a URL especificada não for encontrada.
- 500 Internal Server Error se ocorrer um erro inesperado.