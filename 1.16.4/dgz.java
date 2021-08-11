/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class dgz
/*    */   extends dhc
/*    */   implements dgy
/*    */ {
/*    */   @SerializedName("regionName")
/*    */   private final String a;
/*    */   @SerializedName("ping")
/*    */   private final int b;
/*    */   
/*    */   public dgz(String ☃, int i) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = i;
/*    */   }
/*    */   
/*    */   public int a() {
/* 20 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return String.format(Locale.ROOT, "%s --> %.2f ms", new Object[] { this.a, Float.valueOf(this.b) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */