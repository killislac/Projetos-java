# DOCUMENTAÇÃO JAVA

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

O método equalsIgnoreCase() é usado para comparar o nome de usuário fornecido com o nome de usuário correto, ignorando diferenças de maiúsculas e minúsculas.

----------------------------------------------------------------------------------------------------------------------------------

