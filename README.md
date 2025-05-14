## 📊 Diagrama Entidade-Relacionamento (ER)

```mermaid
erDiagram
    users ||--o{ posts : "1:N"
    users ||--o{ comments : "1:N"
    users ||--o{ likes : "1:N"
    users ||--o{ user_followers : "1:N"
    posts ||--o{ comments : "1:N"
    posts ||--o{ likes : "1:N"
    users ||--o{ user_followers : "seguido por"
    users ||--o{ user_followers : "segue"

    users {
        bigint id PK
        varchar(50) username
        varchar(100) email
        varchar(255) password
        text bio
        varchar(255) profile_picture_url
        timestamp created_at
    }

    posts {
        bigint id PK
        bigint author_id FK
        varchar(500) content
        timestamp created_at
    }

    comments {
        bigint id PK
        bigint post_id FK
        bigint user_id FK
        text text
        timestamp created_at
    }

    likes {
        bigint post_id PK, FK
        bigint user_id PK, FK
        timestamp created_at
    }

    user_followers {
        bigint user_id PK, FK
        bigint follower_id PK, FK
    }
