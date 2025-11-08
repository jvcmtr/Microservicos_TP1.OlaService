# Microservicos_TP1.OlaService
Repositorio destinado a encapsular a logica de negocio da solução `Joao_Ramos_DR3_API`

## Rodando Localmente
Faça o download dos repositorios relacionados a estes projetos e rode cada um deles usando 
```
mvn spring-boot:run
```
**ATENÇÃO:** É importante que o projeto `Joao_Ramos_TP1_CloudConfig` seja o primeiro a ser executado. caso contrário os outros projetos não terão acesso às suas configurações.

Uma vez que todos os processos estejam rodando, podemos consumir seus serviços atravéz dos seguintes URLs:
| Serviço |  url gateway | 
|----------|----------|
| **Frontend** | `http://localhost:8000/app` | 
| **Admin** (Eureka) | `http://localhost:8000/admin` | 
| **OlaService** | `http://localhost:8000/api` | 

### Repositorios relacionados
- [github.com/jvcmtr/Microservicos_TP1.config](https://github.com/jvcmtr/Microservicos_TP1.config)
- [github.com/jvcmtr/Microservicos_TP1.CloudConfig](https://github.com/jvcmtr/Microservicos_TP1.CloudConfig)
- [github.com/jvcmtr/Microservicos_TP1.APIGateway](https://github.com/jvcmtr/Microservicos_TP1.APIGateway)
- [github.com/jvcmtr/Microservicos_TP1.Frontend](https://github.com/jvcmtr/Microservicos_TP1.Frontend)
- [github.com/jvcmtr/Microservicos_TP1.Admin](https://github.com/jvcmtr/Microservicos_TP1.Admin)
- [github.com/jvcmtr/Microservicos_TP1.OlaService](https://github.com/jvcmtr/Microservicos_TP1.OlaService)

> Projeto feito como TP1 para a disciplina de *Microsserviços e DevOps com Spring Boot e Spring Cloud* do *Instituto Infnet* 