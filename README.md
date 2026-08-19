markdown# wardrobe-domain-library

`wardrobe-domain-library` is a central, reusable Java library designed to house the shared data contracts for the wardrobe ecosystem. It encapsulates Data Transfer Objects (DTOs) and event schemas exchanged between the REST API backend and any downstream event consumers.

By decoupling the data layer into this standalone repository, all microservices in the network can maintain strict type safety and unified serialization structures.

## 🚀 Key Features
* **Shared DTOs**: Contains clean, structured POJOs (e.g., `Clothing`) for API integration.
* **Kafka Serialization Contracts**: Configured with Jackson-compatible models to ensure smooth payload distribution across Kafka topics.
* **Framework Independent**: Built with pure Java 21 and lightweight dependencies, making it universally compatible across different microservices.

## 📦 Local Installation
To compile and install this library into your local Maven cache (`~/.m2`), run:
```bash
mvn clean install
```