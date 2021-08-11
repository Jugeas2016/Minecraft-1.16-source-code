/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bky
/*    */   extends blx
/*    */ {
/* 13 */   private static final Map<bkx, bky> a = Maps.newEnumMap(bkx.class);
/*    */   
/*    */   private final bkx b;
/*    */   
/*    */   public bky(bkx ☃, blx.a a1) {
/* 18 */     super(a1);
/* 19 */     this.b = ☃;
/* 20 */     a.put(☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(bmb ☃, bfw bfw1, aqm aqm1, aot aot1) {
/* 25 */     if (aqm1 instanceof bas) {
/* 26 */       bas bas = (bas)aqm1;
/* 27 */       if (bas.aX() && !bas.eM() && bas.eL() != this.b) {
/* 28 */         if (!bfw1.l.v) {
/* 29 */           bas.b(this.b);
/* 30 */           ☃.g(1);
/*    */         } 
/* 32 */         return aou.a(bfw1.l.v);
/*    */       } 
/*    */     } 
/* 35 */     return aou.c;
/*    */   }
/*    */   
/*    */   public bkx d() {
/* 39 */     return this.b;
/*    */   }
/*    */   
/*    */   public static bky a(bkx ☃) {
/* 43 */     return a.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */