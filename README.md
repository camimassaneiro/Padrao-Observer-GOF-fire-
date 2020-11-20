# Padrao-Observer-GOF :fire:
## Linguagem Java

### Programa de medição meteorológica com sensor de temperatura usando Padrão Observer - GOF

Intenção: Definir a dependência um para muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.

Aplicabilidade - Use o padrão Observer quando: 

- Quando uma abstração tem dois aspectos, um dependente do outro. Encapsulando esses aspectos em objetos separados, permite-se variá-los e reutilizá-los independentemente. 
- Quando uma mudança em um objeto exige mudanças em outros, e você não sabe quantos objetos necessitam ser mudados. 
- Quando um objeto deveria ser capaz de notificar outros objetos sem fazer hipóteses, ou usar informações, sobre quem são esses objetos. Em outras palavras, você não quer que esses objetos sejam fortemente acoplados.

### Estrutura
![Estrutura Observer](https://github.com/camimassaneiro/Padrao-Observer/blob/master/Observer.PNG)

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
