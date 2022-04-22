# ktor-sample

> Live-coding a web server with Ktor

**Ktor** is a **Kotlin** framework dedicated to building asynchronous servers and clients in connected systems. In this session, I will explain and demo the core concepts of Ktor 2 by live coding an HTTP server from scratch using Ktor Server. Also, we'll take an overview of Ktor Client, from setting it up to making requests and installing plugins.

## Getting Started

The purpose of this live session will be to send a POST request with a list of names to our web server and our web server will send a random value from this list. It’s a very simple call but it covers a lot of things from Ktor.

```yaml
openapi: 3.0.3
info:
  version: 1.0.0
  title: Am Stram Gram
  description: We are hiring
  contact:
    email: tech@innovorder.fr

servers:
  - url: http://localhost:8080

paths:
  "/random":
    post:
      summary: Randomize
      operationId: randomize
      requestBody:
        content:
          application/json:
            schema:
              $ref: "#/components/schemas/PostRandomRequest"
        description: Value we want to randomize
        required: true
      responses:
        "201":
          description: Returns a random value
          content:
            application/json:
              schema:
                $ref: "#/components/schemas/PostRandomResponse"							
components:
  schemas:
    PostRandomRequest:
      type: object
      required:
        - names
      properties:
        names:
          type: array
          items:
            type: string
    PostRandomResponse:
      type: object
      required:
        - random
      properties:
        random:
          type: string

```
