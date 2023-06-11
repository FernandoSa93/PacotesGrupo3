@startuml
package "CerticSys" {
  package "Base de dados" {
    [Lógica de interação com a base de dados]
  }

  package "Gerência" {
    together {
      [Interface de gerência de usuários] - [Lógica de gerência de usuários]
      [Lógica de gerência de usuários]
    }
    together {
      [Interface de gerência de entidades avaliadoras] - [Lógica de gerência de entidades avaliadoras]
      [Lógica de gerência de entidades avaliadoras] 
    }
    "Lógica de gerência de usuários" -[hidden]-> "Interface de gerência de entidades avaliadoras"
  }

  package "Relatórios" {
    [Interface de relatórios] - [Lógica de relatórios]
    [Lógica de relatórios]
  }

  package "Treinamentos" {
    together {
      [Interface de cadastro de treinamentos] - [Lógica de cadastro de treinamentos]
      [Lógica de cadastro de treinamentos]
    }
    together {
      [Interface de treinamentos] - [Lógica de treinamentos]
      [Lógica de treinamentos]
    }
    "Lógica de cadastro de treinamentos" -[hidden]-> "Interface de treinamentos"
  }

  package "Avaliações" {
    together {
      [Interface de simulação de avaliações] - [Lógica de simulação de avaliações]
      [Lógica de simulação de avaliações]
    }
    together {
      [Interface de revisão de avaliações] - [Lógica de revisão de avaliações]
      [Lógica de revisão de avaliações]
    }
    "Lógica de simulação de avaliações" -[hidden]-> "Interface de revisão de avaliações"
  }

  package "Login" {
    [Interface de login] - [Lógica de login]
    [Lógica de login]
  }

  "Login" --> "Base de dados"
  "Avaliações" --> "Base de dados"
  "Treinamentos" --> "Base de dados"
  "Relatórios" --> "Base de dados"
  "Gerência" --> "Base de dados"
}
@enduml