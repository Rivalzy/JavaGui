package SidebarMenu;

import java.awt.Dimension;
import org.jdesktop.animation.timing.*;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class Animation {
    
    private final IconItems item;
    private Animator animator;
    private TimingTarget target;
    
    public Animation(IconItems item) {
        this.item = item;
        this.animator = new Animator(150);
        this.animator.setResolution(0);
    }
    
    public void mouseEnter() {
        stop();
        animator.removeTarget(target);
        target = new PropertySetter(item, "imageSize", item.getImageSize(), new Dimension(55,55));
        animator.addTarget(target);
        animator.start();
    }
    
    public void mouseExit() {
        stop();
        animator.removeTarget(target);
        target = new PropertySetter(item, "imageSize", item.getImageSize(), new Dimension(40,40));
        animator.addTarget(target);
        animator.start();
    }
    
    public void stop(){
        if (animator.isRunning()){
            animator.stop();
        }
    }
}
