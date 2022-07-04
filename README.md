O QUE FOI FEITO DE DIFERENTE:
Utilizado o Python com o MutPy e feito conforme o exemplo.
Criado o arquivo main.py com a classe CalculatorTest derivando da classe da lib unittest (TestCase), após isso foi criado no arquivo calculator.py
a classe Calculator com métodos de divisão, subtração, multiplicação e soma. Após isso foi criado dentro do main.py métodos para testar esses métodos da classe Calculator.
Logo foi executado os testes.
 
Para executar os testes de mutação foi utilizado esse comando: mut.py --target calculator --unit-test main.py -m
