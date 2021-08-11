/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
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
/*    */ public class a
/*    */ {
/* 68 */   private final Map<arg, arh> a = Maps.newHashMap();
/*    */   private boolean b;
/*    */   
/*    */   private arh b(arg ☃) {
/* 72 */     arh arh = new arh(☃, arh1 -> {
/*    */           if (this.b) {
/*    */             throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + gm.af.b(☃));
/*    */           }
/*    */         });
/* 77 */     this.a.put(☃, arh);
/* 78 */     return arh;
/*    */   }
/*    */   
/*    */   public a a(arg ☃) {
/* 82 */     b(☃);
/* 83 */     return this;
/*    */   }
/*    */   
/*    */   public a a(arg ☃, double d) {
/* 87 */     arh arh = b(☃);
/* 88 */     arh.a(d);
/* 89 */     return this;
/*    */   }
/*    */   
/*    */   public ark a() {
/* 93 */     this.b = true;
/* 94 */     return new ark(this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ark$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */