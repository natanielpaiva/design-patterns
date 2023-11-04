# Exemplo simples de Strategy utilizando Java.

Este projeto é uma aplicação Java que ilustra o uso do padrão de design Strategy em um sistema de pagamento. O padrão Strategy é utilizado para criar um conjunto de algoritmos encapsulados e torná-los intercambiáveis. Isso nos permite alterar o comportamento de uma parte do programa durante a execução, escolhendo entre diferentes algoritmos ou estratégias.

## O que é o Padrão Strategy?

O padrão Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsular cada um deles em uma classe separada e torná-los intercambiáveis. O padrão Strategy permite que a lógica de seleção do algoritmo seja independente dos objetos que utilizam o algoritmo.

Em termos mais simples, imagine que você tem um aplicativo que oferece diferentes maneiras de filtrar uma lista de itens: você pode filtrar por preço, por rating ou por categoria. Em vez de escrever um código complexo com muitos `if-else` para escolher o filtro, você pode usar o padrão Strategy para separar os algoritmos de filtragem em diferentes classes e mudar o filtro dinamicamente conforme a escolha do usuário.

## Implementação no Sistema de Pagamento

No contexto do nosso sistema de pagamento, utilizamos o padrão Strategy para permitir que o cliente escolha como deseja realizar o pagamento. Por exemplo, alguns clientes podem preferir pagar com cartão de crédito, enquanto outros podem preferir usar serviços como PayPal.

Aqui está como aplicamos o padrão:

- **PaymentStrategy:** Uma interface que define a operação de pagamento. Todos os métodos de pagamento vão implementar esta interface.
- **CreditCardPayment e PaypalPayment:** Classes concretas que implementam `PaymentStrategy`. Cada uma dessas classes representa um modo de pagamento diferente.
- **ShoppingCart:** A classe que utiliza um `PaymentStrategy`. O cliente pode escolher e mudar a estratégia de pagamento desejada antes de finalizar a compra.

## Exemplo de Uso

```java
ShoppingCart cart = new ShoppingCart();
cart.addItem(new Item(150));
cart.addItem(new Item(750));

// Cliente escolhe pagar com PayPal
cart.setPaymentStrategy(new PaypalPayment("email@example.com", "senha"));
cart.checkout();

// Cliente muda de ideia e quer pagar com cartão de crédito
cart.setPaymentStrategy(new CreditCardPayment("Nome", "1234 5678 9123 4567", "123", "12/26"));
cart.checkout();
