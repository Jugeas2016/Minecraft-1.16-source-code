/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bly
/*    */ {
/* 10 */   private final Map<blx, a> a = Maps.newHashMap();
/*    */   private int b;
/*    */   
/*    */   public boolean a(blx ☃) {
/* 14 */     return (a(☃, 0.0F) > 0.0F);
/*    */   }
/*    */   
/*    */   public float a(blx ☃, float f) {
/* 18 */     a a = this.a.get(☃);
/*    */     
/* 20 */     if (a != null) {
/* 21 */       float f1 = (a.a(a) - a.b(a));
/* 22 */       float f2 = a.a(a) - this.b + f;
/* 23 */       return afm.a(f2 / f1, 0.0F, 1.0F);
/*    */     } 
/*    */     
/* 26 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public void a() {
/* 30 */     this.b++;
/*    */     
/* 32 */     if (!this.a.isEmpty()) {
/* 33 */       for (Iterator<Map.Entry<blx, a>> ☃ = this.a.entrySet().iterator(); ☃.hasNext(); ) {
/* 34 */         Map.Entry<blx, a> entry = ☃.next();
/* 35 */         if (a.a((a)entry.getValue()) <= this.b) {
/* 36 */           ☃.remove();
/* 37 */           c(entry.getKey());
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(blx ☃, int i) {
/* 44 */     this.a.put(☃, new a(this.b, this.b + i));
/* 45 */     b(☃, i);
/*    */   }
/*    */   
/*    */   public void b(blx ☃) {
/* 49 */     this.a.remove(☃);
/* 50 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(blx ☃, int i) {}
/*    */   
/*    */   protected void c(blx ☃) {}
/*    */   
/*    */   class a
/*    */   {
/*    */     private final int b;
/*    */     private final int c;
/*    */     
/*    */     private a(bly this$0, int ☃, int i) {
/* 64 */       this.b = ☃;
/* 65 */       this.c = i;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */