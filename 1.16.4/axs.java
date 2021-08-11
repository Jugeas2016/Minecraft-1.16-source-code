/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axs<T extends aqm>
/*    */   extends axq<T>
/*    */ {
/*    */   private int i;
/*    */   
/*    */   public axs(bhc ☃, Class<T> clazz, boolean bool, @Nullable Predicate<aqm> predicate) {
/* 15 */     super(☃, clazz, 500, bool, false, predicate);
/* 16 */     this.i = 0;
/*    */   }
/*    */   
/*    */   public int h() {
/* 20 */     return this.i;
/*    */   }
/*    */   
/*    */   public void j() {
/* 24 */     this.i--;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 29 */     if (this.i > 0 || !this.e.cY().nextBoolean()) {
/* 30 */       return false;
/*    */     }
/* 32 */     if (!((bhc)this.e).fb()) {
/* 33 */       return false;
/*    */     }
/*    */     
/* 36 */     g();
/* 37 */     return (this.c != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 42 */     this.i = 200;
/* 43 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */