# ITEM-API
Uma api para criar diferentes tipos de itens.


Há dois tipos de itens nessa API: Itens e Skulls.


###Criando Itens
  Para criar  itens, você precisará instanciar o `ItemBuilder`
  
  Aqui temos um exemplo de criação de item comum.
  
  ```
   ItemStack build = new ItemBuilder(Material.DIAMOND)
   .setDisplayName("&7Um plugin legal!")
   .setLore(Arrays.asList(
           "&6First line,
           "Second line"
           ))
   .build();
  ```

###Criando Skulls (Cabeças)

Para criar cabeças, você precisará instanciar o `SkullBuilder`

Aqui temos um exemplo de criação de skulls.

 ```
 ItemStack zAryon = new SkullBuilder().setOwner("zAryon").build();
 ```
 
 
### Considerações Finais

Se eu ajudei, siga-me no GitHub, irei postar novas API's para auxiliar e projetos aqui também. Sinta-se livre para dar fork nesse projeto e aprimorá-lo, assim como utilizá-lo em seus codigos livremente, contanto que deixe bem claro meus créditos e propriedade sobre esse projeto.

 