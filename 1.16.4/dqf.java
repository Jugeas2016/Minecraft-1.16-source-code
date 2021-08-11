/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqf
/*    */ {
/* 13 */   private static final vk a = new vk("minecraft", "alt");
/* 14 */   private static final ob b = ob.a.a(a);
/*    */   
/* 16 */   private static final dqf c = new dqf();
/*    */   
/* 18 */   private final Random d = new Random();
/*    */   
/* 20 */   private final String[] e = new String[] { "the", "elder", "scrolls", "klaatu", "berata", "niktu", "xyzzy", "bless", "curse", "light", "darkness", "fire", "air", "earth", "water", "hot", "dry", "cold", "wet", "ignite", "snuff", "embiggen", "twist", "shorten", "stretch", "fiddle", "destroy", "imbue", "galvanize", "enchant", "free", "limited", "range", "of", "towards", "inside", "sphere", "cube", "self", "other", "ball", "mental", "physical", "grow", "shrink", "demon", "elemental", "spirit", "animal", "creature", "beast", "humanoid", "undead", "fresh", "stale", "phnglui", "mglwnafh", "cthulhu", "rlyeh", "wgahnagl", "fhtagn", "baguette" };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static dqf a() {
/* 47 */     return c;
/*    */   }
/*    */   
/*    */   public nu a(dku ☃, int i) {
/* 51 */     StringBuilder stringBuilder = new StringBuilder();
/* 52 */     int j = this.d.nextInt(2) + 3;
/*    */     
/* 54 */     for (int k = 0; k < j; k++) {
/* 55 */       if (k != 0) {
/* 56 */         stringBuilder.append(" ");
/*    */       }
/* 58 */       stringBuilder.append(x.<String>a(this.e, this.d));
/*    */     } 
/* 60 */     return ☃.b().a((new oe(stringBuilder.toString())).c(b), i, ob.a);
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 64 */     this.d.setSeed(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */