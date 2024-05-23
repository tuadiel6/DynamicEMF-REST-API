# Dynamic provisioning of RESTful services for Model Management

<p align="justify">We present an approach for provisioning a REST API middleware for a distributed modeling platform. This approach leverages model reflection to dynamically provide a REST API specifically tailored to the metamodels and models stored in the repository.</p>

<div align="justify">Our approach consists of the following main components: (a) an MDE (Model-Driven Engineering) repository that stores model-based artifacts, primarily focusing on metamodels and their corresponding models, and (b) a middleware interface, which offers a REST API to access the models stored within the MDE repository.</div>

> [!NOTE]
> The middleware has been developed using the [Spring Boot framework](https://spring.io/projects/spring-boot), a component of the Spring ecosystem that simplifies application development by reducing manual configuration. Spring Boot simplifies service setup and deployment with an embedded server, facilitating the creation of microservices in our REST API middleware. In our approach, the middleware is responsible for enabling the interaction with the stored models.

<p align="justify">The implemented middleware follows a three-layer architecture, inspired by the Spring Boot framework, consisting of the code repository, service, and controller layers. Below, we describe the main responsibilities of each layer in our approach:</p>

## Code Repository Layer

<p align="justify">This layer is the primary gateway for data access within our system. It handles the retrieval, storage, and manipulation of data, encapsulating fundamental CRUD (Create, Read, Update, Delete) operations and translating them into model manipulation operations.</p>

> [!NOTE]
> It is important to note that this layer executes model operations in stateless mode, thus ensuring that each operation is self-contained and independent.

## Service Layer

## Controller Layer
