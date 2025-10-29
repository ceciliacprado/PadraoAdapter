# 🧩 Sistema de Integração de APIs de Mídia Social (Padrão Adapter)

## 🎯 Objetivo
Este projeto tem como objetivo demonstrar o uso do **Padrão de Projeto Adapter** em Java, integrando múltiplas redes sociais (Twitter, Instagram, LinkedIn e TikTok) através de uma **interface unificada**.

O sistema simula a autenticação, publicação e obtenção de estatísticas de diferentes plataformas, abstraindo as diferenças entre as APIs e fornecendo uma camada única de comunicação.

---

## 🏗️ Arquitetura
O projeto é composto por:

- **Interface `SocialMediaAdapter`**: define as operações padrão para todas as redes sociais.  
- **Adapters Concretos** (`TwitterAdapter`, `InstagramAdapter`, `LinkedInAdapter`, `TikTokAdapter`): implementam a interface adaptando cada API.
- **`GerenciadorMidiaSocial`**: classe que representa a interface unificada para interação com as redes.
- **Modelos (`Conteudo`, `SocialMediaResponse`)**: classes simples que armazenam informações de publicações e estatísticas.
- **`MainDemo`**: classe principal que demonstra o uso do sistema.

---

## 💡 Padrão de Projeto Utilizado

### 🔹 Adapter
O **Adapter** permite que classes com interfaces diferentes trabalhem juntas.  
No contexto deste projeto, cada rede social possui sua própria forma de autenticação e publicação, mas o `Adapter` faz a tradução dessas diferenças para uma **interface comum (`SocialMediaAdapter`)**.

Isso garante:
- **Flexibilidade:** fácil adicionar novas redes no futuro.  
- **Desacoplamento:** o código principal não depende de APIs específicas.  
- **Manutenibilidade:** mudanças em uma plataforma não afetam as outras.
