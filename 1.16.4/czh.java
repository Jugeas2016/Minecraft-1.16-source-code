/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.function.Consumer;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czh
/*    */   extends czj
/*    */ {
/*    */   czh(czq[] ☃, dbo[] arrayOfDbo) {
/* 12 */     super(☃, arrayOfDbo);
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 17 */     return czo.f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected czi a(czi[] ☃) {
/* 22 */     switch (☃.length) {
/*    */       case 0:
/* 24 */         return a;
/*    */       case 1:
/* 26 */         return ☃[0];
/*    */       case 2:
/* 28 */         return ☃[0].b(☃[1]);
/*    */     } 
/* 30 */     return (cyv1, consumer) -> {
/*    */         for (czi czi1 : ☃) {
/*    */           if (czi1.expand(cyv1, consumer)) {
/*    */             return true;
/*    */           }
/*    */         } 
/*    */         return false;
/*    */       };
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 43 */     super.a(☃);
/*    */     
/* 45 */     for (int i = 0; i < this.c.length - 1; i++) {
/* 46 */       if (ArrayUtils.isEmpty((Object[])(this.c[i]).d))
/* 47 */         ☃.a("Unreachable entry!"); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czq.a<a> {
/* 53 */     private final List<czq> a = Lists.newArrayList();
/*    */     
/*    */     public a(czq.a<?>... ☃) {
/* 56 */       for (czq.a<?> a1 : ☃) {
/* 57 */         this.a.add(a1.b());
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     protected a a() {
/* 63 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public a a(czq.a<?> ☃) {
/* 68 */       this.a.add(☃.b());
/* 69 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public czq b() {
/* 74 */       return new czh(this.a.<czq>toArray(new czq[0]), f());
/*    */     }
/*    */   }
/*    */   
/*    */   public static a a(czq.a<?>... ☃) {
/* 79 */     return new a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */