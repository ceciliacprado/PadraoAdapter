# Sistema de Integração de APIs de Mídia Social (Adapter Pattern) - Exemplo em Java

## Objetivo
Demonstrar o padrão Adapter para unificar integrações com múltiplas redes sociais (Twitter, Instagram, LinkedIn, TikTok).

## O que está implementado
- Models: Conteudo, Publicacao, Estatisticas
- Interface unificada: `GerenciadorMidiaSocial`
- `SocialMediaAdapter` + Adapters simulados para Twitter, Instagram, LinkedIn e TikTok
- `SocialMediaResponse` — resposta unificada (sucesso/falha + dados)
- Configuração via `config.properties`
- Demo em `MainDemo`

> **Nota:** A parte de Factory / Strategy não foi implementada conforme instrução (será feita em sala). Deixei pontos onde a Factory seria integrada.

## Como rodar
1. Configurar `src/main/resources/config.properties` com chaves.
2. Build com Maven/Gradle.
3. `java -cp target/yourjar.jar com.agency.social.MainDemo`

## Extensões possíveis
- Implementar chamadas reais HTTP para cada adapter (usar HttpClient/RestTemplate).
- Implementar Factory para criar adapters dinamicamente a partir de config.
- Agendamento real com fila/cron (Quartz / ScheduledExecutorService).
- Persistência de publicações (BD) e dashboard de estatísticas.
