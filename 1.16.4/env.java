/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Random;
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
/*    */ 
/*    */ public class env
/*    */   implements enw<emq>
/*    */ {
/* 18 */   private final List<enw<emq>> a = Lists.newArrayList();
/*    */   
/* 20 */   private final Random b = new Random();
/*    */   
/*    */   private final vk c;
/*    */   @Nullable
/*    */   private final nr d;
/*    */   
/*    */   public env(vk ☃, @Nullable String str) {
/* 27 */     this.c = ☃;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     this.d = (str == null) ? null : new of(str);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int e() {
/* 42 */     int ☃ = 0;
/* 43 */     for (enw<emq> enw1 : this.a) {
/* 44 */       ☃ += enw1.e();
/*    */     }
/* 46 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public emq a() {
/* 51 */     int ☃ = e();
/*    */     
/* 53 */     if (this.a.isEmpty() || ☃ == 0) {
/* 54 */       return enu.a;
/*    */     }
/*    */     
/* 57 */     int i = this.b.nextInt(☃);
/* 58 */     for (enw<emq> enw1 : this.a) {
/* 59 */       i -= enw1.e();
/*    */       
/* 61 */       if (i < 0) {
/* 62 */         return enw1.k();
/*    */       }
/*    */     } 
/*    */     
/* 66 */     return enu.a;
/*    */   }
/*    */   
/*    */   public void a(enw<emq> ☃) {
/* 70 */     this.a.add(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public nr c() {
/* 79 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(enr ☃) {
/* 84 */     for (enw<emq> enw1 : this.a)
/* 85 */       enw1.a(☃); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\env.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */