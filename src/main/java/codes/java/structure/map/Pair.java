package codes.java.structure.map;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description
 */
public class Pair {
  public int key;
  public String val;

  public Pair(int key, String val) {
    this.key = key;
    this.val = val;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }
}
