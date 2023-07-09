# Plano de Testes

## Para a verificação estática foi utilizada a extensão SonarLint

## Testes de `Animal`

1. **Teste de GetName()**
   Verificar se o método `getName()` retorna o nome correto do animal.
2. **Teste de SetName()**
   Verificar se o método `setName()` atribui corretamente o nome ao animal.
3. **Teste de GetBreed()**
   Verificar se o método `getBreed()` retorna a raça correta do animal.
4. **Teste de SetBreed()**
   Verificar se o método `setBreed()` atribui corretamente a raça ao animal.
5. **Teste de ToString()**
   Verificar se o método `toString()` retorna a representação em string correta do animal.
6. **Teste de GetTutor()**
   Verificar se o método `getTutor()` retorna o tutor corretamente associado ao animal.
7. **Teste de SetTutor()**
   Verificar se o método `setTutor()` atribui corretamente um tutor ao animal.
8. **Teste de GetTutorQuandoNaoAssociado()**
   Verificar se o método `getTutor()` retorna `null` quando o animal não está associado a um tutor.
9. **Teste de SetTutorParaNull()**
   Verificar se o método `setTutor()` remove corretamente a associação com o tutor quando passado `null` como argumento.
10. **Teste de EqualsParaMesmoAnimal()**
   Verificar se o método `equals()` retorna verdadeiro quando comparado com outro objeto `Animal` que representa o mesmo animal.
11. **Teste de EqualsParaAnimaisDiferentes()**
    Verificar se o método `equals()` retorna falso quando comparado com outro objeto `Animal` que representa um animal diferente.

## Testes de `Tutor`

1. **Teste de GetName()**
   Verificar se o método `getName()` retorna o nome correto do tutor.
2. **Teste de SetName()**
   Verificar se o método `setName()` atribui corretamente o nome ao tutor.
3. **Teste de GetEmail()**
   Verificar se o método `getEmail()` retorna o e-mail correto do tutor.
4. **Teste de SetEmail()**
   Verificar se o método `setEmail()` atribui corretamente o e-mail ao tutor.
5. **Teste de ToString()**
   Verificar se o método `toString()` retorna a representação em string correta do tutor.
6. **Teste de AddAnimal()**
   Verificar se o método `addAnimal()` adiciona corretamente um animal à lista de animais do tutor.
7. **Teste de GetAnimals()**
   Verificar se o método `getAnimals()` retorna corretamente a lista de animais associados ao tutor.
8. **Teste de EqualsParaMesmoTutor()**
   Verificar se o método `equals()` retorna verdadeiro quando comparado com outro objeto `Tutor` que representa o mesmo tutor.
9. **Teste de EqualsParaTutoresDiferentes()**
   Verificar se o método `equals()` retorna falso quando comparado com outro objeto `Tutor` que representa um tutor diferente.

## Testes de Componentes para a relação entre `Animal` e `Tutor`

1. **Teste de CreateAnimalWithTutor()**
   Verificar se é possível criar um animal e associá-lo a um tutor. O animal deve ser persistido no repositório de animais e o tutor deve ser persistido no repositório de tutores. Em seguida, verificar se o tutor persistido contém o animal associado corretamente.
2. **Teste de CreateTutorWithAnimal()**
   Verificar se é possível criar um tutor e associá-lo a um animal. O tutor deve ser persistido no repositório de tutores e o animal deve ser persistido no repositório de animais. Em seguida, verificar se o animal persistido contém o tutor associado corretamente.

### Esses testes possuem o objetivo de garantir o funcionamento correto das classes `Animal`, `Tutor` e a associação entre elas
