/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djq
/*    */ {
/*    */   private final dwu a;
/* 15 */   private int b = -1;
/*    */   
/*    */   @Nullable
/*    */   private Consumer<md> c;
/*    */   
/*    */   public djq(dwu ☃) {
/* 21 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(int ☃, @Nullable md md1) {
/* 25 */     if (this.b == ☃ && this.c != null) {
/* 26 */       this.c.accept(md1);
/* 27 */       this.c = null;
/* 28 */       return true;
/*    */     } 
/*    */     
/* 31 */     return false;
/*    */   }
/*    */   
/*    */   private int a(Consumer<md> ☃) {
/* 35 */     this.c = ☃;
/* 36 */     return ++this.b;
/*    */   }
/*    */   
/*    */   public void a(int ☃, Consumer<md> consumer) {
/* 40 */     int i = a(consumer);
/* 41 */     this.a.a(new so(i, ☃));
/*    */   }
/*    */   
/*    */   public void a(fx ☃, Consumer<md> consumer) {
/* 45 */     int i = a(consumer);
/* 46 */     this.a.a(new sc(i, ☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */