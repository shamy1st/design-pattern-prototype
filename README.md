# Prototype Design Pattern (Java)
**Prototype** cloning an object instead of creating new one.
![](https://github.com/shamy1st/design-pattern-prototype/blob/main/uml.png)
### Problem:
Assume that creating **Shape** (Circle, Rectangle, ...) is costly, tehn we can cache the Shape types like (**Circle**, **Rectangle**) and returns their clone when requesting a new Shape of these types.

    public class Main {
        public static void main(String[] args) {
            ShapeCache.loadCache();

            Shape clonedShape = (Shape) ShapeCache.getShape("1");
            System.out.println("Shape : " + clonedShape.getType());

            Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
            System.out.println("Shape : " + clonedShape2.getType());
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-prototype/blob/main/uml-solution.png)
