Algoritmo genérico para criação de jogos 2D.
### Demo 
<img src="https://github.com/marconiryan/make-games/blob/main/img/demo.gif" width="600" height="400" />

### Criar elementos
~~~ Java
public void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        Graphics2D graphics2D = (Graphics2D) graph;
        block.drawBlock(graphics2D); // Desenha o bloco
        graphics2D.dispose();
    }
 ~~~
 ### Atualizar elementos
 ~~~ Java
   public void update() {
        block.update(); // Atualiza a posição do bloco
    }
 ~~~
 
 
