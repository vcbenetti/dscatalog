# 📦 DSCatalog - API de Catálogo de Produtos e Serviços

## 📄 Descrição do Projeto
O DSCatalog é uma API RESTful robusta desenvolvida com Spring Boot, projetada para gerenciar um catálogo completo de produtos e categorias. Este projeto demonstra a implementação de um sistema de backend escalável que inclui as principais funcionalidades de CRUD (Create, Read, Update, Delete), paginação, filtros e, crucialmente, um sistema de autenticação e autorização completo (RBAC - Role-Based Access Control) usando Spring Security e JWT.

Este repositório foca exclusivamente na camada backend (Java/Spring Boot), servindo como a fundação para qualquer aplicação frontend de catálogo.

## ✨ Funcionalidades (Endpoints da API)
A API fornece um conjunto de endpoints que cobrem toda a gestão do catálogo e usuários:

1. Gestão de Produtos e Categorias
CRUD Completo: Endpoints para criar, ler, atualizar e deletar produtos e categorias.

Listagem Paginada: Endpoint para buscar todos os produtos de forma paginada.

Filtros Avançados: Busca de produtos por nome e por categorias.

Busca por ID: Retorna os detalhes de um produto ou categoria específica.

2. Segurança e Autenticação (Spring Security)
Autenticação JWT: Sistema de login seguro para geração de tokens de acesso (JWT).

Perfis de Acesso: Definição de perfis de usuário, tipicamente:

CLIENT: Para visualização.

ADMIN ou OPERATOR: Para gerenciar (CRUD) produtos, categorias e usuários.

Autorização: Restrição de acesso aos endpoints de escrita (POST, PUT, DELETE) apenas para usuários com perfil de administrador.

3. Gestão de Usuários
CRUD de usuários (restrito a administradores).

Endpoint para buscar o perfil do usuário logado.

## 💻 Tecnologias Utilizadas (Backend)
Linguagem: Java

Framework: Spring Boot 3

Segurança: Spring Security (com JWT)

Persistência: Spring Data JPA / Hibernate

Banco de Dados: PostgreSQL (Recomendado) e H2 Database (para testes)

Gerenciador de Dependências: Apache Maven

Testes: JUnit 5
