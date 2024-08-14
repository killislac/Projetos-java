# DOCUMENTAÇÃO DE ALGUMAS INFOR. IMPORTATES NO JAVA

Direrença entre JRE e JDK

JRE: Java Runtime Env. <- Usuario

JDK: Java Dev Kit. <- Desenvolvedor

JVM: Java Virtual Machine 

.java -> .class -> ByteCode -> Joga o BtyeCode para a JVM e ele traduz sempre que necessario.


----------------------------------------------------------------------------------------------------------------------------------

Ao usar o `Scanner variavel = new Scanner(System.in);` é necessario a ultilização de uma sabia relacional ao seu tipo ou seja, existem duas formas:

1.Integer:
```java
 int valor1 = Integer.parseInt(entrada.next());
 ```
2.Int:
```java
 int valor1 = entrada.nextInt();
```


----------------------------------------------------------------------------------------------------------------------------------

# EQUALS
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1.equals(s2)); // true, porque o conteúdo é o mesmo
System.out.println(s1.equals(s3)); // true, porque o conteúdo é o mesmo
```

# ==
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2); // true, porque ambos referenciam o mesmo literal
System.out.println(s1 == s3); // false, porque s3 é um novo objeto
```

# EQUAL(função)
```java

  if (usuario.equalsIgnoreCase(usuarioCorreto));
```
O método equalsIgnoreCase() é usado para comparar o nome de usuário fornecido com o nome de usuário correto, ignorando diferenças de maiúsculas e minúsculas.

---------------------------------------------------------------------------------------------------------------------------

# STATIC

Quando se usa a palavra-chave   `static` em uma classe, está criando um atributo ou método que pertence à classe em si, e não a uma instância específica da classe. Isso significa que todos os objetos daquela classe compartilham o mesmo valor para esse atributo ou método.

```java
public class Pessoa {
    // Atributo static para contar o número de pessoas
    private static int contadorPessoas = 0;

    // Construtor
    public Pessoa() {
        // Incrementa o contador sempre que uma nova pessoa é criada
        contadorPessoas++;
    }

    // Método static para obter o número total de pessoas
    public static int getContadorPessoas() {
        return contadorPessoas;
    }
}

public class Main {
    public static void main(String[] args) {
        // Cria algumas instâncias de Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        // Imprime a quantidade total de pessoas
        System.out.println("Número total de pessoas: " + Pessoa.getContadorPessoas());
    }
}
```