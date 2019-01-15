/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testnegate()
  {
    Picture beach = new Picture("water.jpg");

    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testzeroGreen()
  {
    Picture beach = new Picture("water.jpg");

    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }

  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("water.jpg");

    beach.explore();
    beach.KeepOnlyGreen();
    beach.explore();
  }


  public static void testgrayscale()
  {
    Picture beach = new Picture("water.jpg");

    beach.explore();
    beach.grayScale();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach=new Picture("beach.jpg");
    beach.explore();
    beach.KeepOnlyBlue();
    beach.explore();

  }

  public static void testFixUnderwater()
  {
    Picture beach=new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("butterfly1.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("beach.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture butterfly1=new Picture("butterfly1.jpg" );
    butterfly1.explore();
    butterfly1.mirrorVerticalRightToLeft();
    butterfly1.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("beach.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("water.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

 /* public static void testMirroHorizontal()
  {
    Picture wall= new Picture("wall.jpg");
    wall.explore();
    wall.mirrorHorizontal();
    wall.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture robot=new Picture("robot.jpg");
    robot.explore();
    robot.mirrorHorizontalBotToTop();
    robot.explore();
  }
  */
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testzeroGreen();
    //testnegate();
    //testgrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontalBotToTop();
    // testMirroHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testfixUnderwater();
  }
}