package homework.HW72;

public class Block {
//    Write a class Block that creates a block (Duh..)
//    Requirements
//    The constructor should take an array as an argument,
//    this will contain 3 integers of the form [width, length, height]
//    from which the Block should be created.
//    Define these methods:
//            `getWidth()` return the width of the `Block`
//            `getLength()` return the length of the `Block`
//            `getHeight()` return the height of the `Block`
//            `getVolume()` return the volume of the `Block`
//            `getSurfaceArea()` return the surface area of the `Block`
    int width;
    int length;
    int height;

    public Block(int[] blk) {
        width = blk[0];
        length = blk[1];
        height = blk[2];
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }

    public int getVolume() {
        int volume = width * length * height;
       return volume;
    }

    public int getSurfaceArea() {
        int surf = (width * length + length * height + width * height) * 2;
        return surf;
    }

    public static void main(String[] args) {
        Block bl = new Block(new int[]{2,4,6});
        System.out.println(bl.getWidth());
        System.out.println(bl.getLength());
        System.out.println(bl.getHeight());
        System.out.println(bl.getVolume());
        System.out.println(bl.getSurfaceArea());

    }
}