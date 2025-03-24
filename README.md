Universidade Tecnológica Federal do Paraná
Engenharia de Software - Curso de Arquitetura de Software (AS27S)
INSTRUTOR: Prof. Dr. Gustavo Santos
Lais Maruyama Domingos, 2409917

# CCH - Design Patterns Bridge
## Problema
Uma abstração pode ter uma entre várias implementações possíveis, no entanto não é flexível utilizar herança, pois a herança liga uma implementação à abstração permanentemente, o que torna difícil modificar, aumentar e reutilizar abstrações e implementações independentemente
Descrição da Solução
O padrão Bridge separa a abstração de um objeto da sua implementação, de maneira que elas possam variar independentemente.

## Visão Geral Sistemas de Banco de Dados

Abstração: Consultas SQL.
Implementação: Diferentes tipos de banco de dados (MySQL, PostgreSQL).
Exemplo: Um sistema de persistência de dados que utiliza a abstração de uma consulta SQL, mas executa essa consulta de maneira diferente, dependendo do banco de dados subjacente.

## Consequências [vantagens e desvantagens]
### Vantagens:
Desacoplamento da interface da implementação: A implementação não está permanentemente vinculada à interface, permitindo que a implementação seja configurada em tempo de execução. Além disso, o desacoplamento elimina dependências de tempo de compilação, o que significa que mudar uma classe de implementação não exige a recompilação da classe de abstração e seus clientes. Isso é útil para manter a compatibilidade binária entre diferentes versões de uma biblioteca de classes.
Extensibilidade melhorada: Hierarquias de Abstraction e Implementor podem ser estendidas de maneira independente, facilitando a evolução e a modificação do sistema sem comprometer a estrutura.
Ocultação de detalhes de implementação: Os clientes ficam protegidos de detalhes internos de implementação, como o compartilhamento de objetos Implementor e o mecanismo de contagem de referências, proporcionando maior segurança e simplicidade no uso.
### Desvantagens:
A flexibilidade proporcionada pelo desacoplamento e pela possibilidade de troca de implementações em tempo de execução pode aumentar a complexidade do sistema, pois a manutenção de diferentes implementações pode tornar-se mais difícil, especialmente em sistemas grandes.
O fato de ocultar detalhes de implementação pode dificultar o diagnóstico de problemas e a personalização direta em alguns casos, já que os clientes não têm acesso direto à implementação.
