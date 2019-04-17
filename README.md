# Lab10
In this lab the concepts concerning basic GUI and graphics inmplementation were covered. Basic drawing algorithms were implemented for basic geometric shapes such as simple polygons and ellipses.
All these shape implementations were drawn together and painted in a JPanel.
Of the choices of what to draw, I chose to think a bit creatively and animate my panel.
My program simply draws random shapes of random color of random size and position onto the panel.
The result is something that looks a bit like the 90's design, which is appropriate considering we are using Swing.
# Sample Output Images
![alt text](https://user-images.githubusercontent.com/47227872/56259270-17acb200-6098-11e9-9c1f-40c77e941218.png)
![alt text](https://user-images.githubusercontent.com/47227872/56259271-17acb200-6098-11e9-8b9f-1876943fe72b.png)
![alt text](https://user-images.githubusercontent.com/47227872/56259272-17acb200-6098-11e9-9403-e789e98e1d7f.png)

# Commentary
After all the Shape classes were implemented by specifying how the Point[] location array was to be initialized and populated based on the shape, most drawing methods were contained in parent classes are were generic enough to apply to all the children classes. This greatly simplified the code, as in the case of all the polygons, which are drawn in identical ways.
# Conclusion
In conclusion, this lab demonstrated basic GUI and graphics concepts by implementing algorithms for drawing basic geometric shapes and using those algorithms appropriately for a Swing-based window.
