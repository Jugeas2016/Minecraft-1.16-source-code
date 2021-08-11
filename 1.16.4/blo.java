/*    */ import java.util.List;
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
/*    */ public class blo
/*    */   extends bko
/*    */ {
/*    */   private final aqe<?> a;
/*    */   
/*    */   public blo(aqe<?> ☃, cuw cuw1, blx.a a1) {
/* 30 */     super(cuw1, a1);
/* 31 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, bmb bmb1, fx fx1) {
/* 36 */     if (☃ instanceof aag) {
/* 37 */       a((aag)☃, bmb1, fx1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(@Nullable bfw ☃, bry bry1, fx fx1) {
/* 43 */     bry1.a(☃, fx1, adq.bk, adr.g, 1.0F, 1.0F);
/*    */   }
/*    */   
/*    */   private void a(aag ☃, bmb bmb1, fx fx1) {
/* 47 */     aqa aqa = this.a.a(☃, bmb1, null, fx1, aqp.l, true, false);
/*    */     
/* 49 */     if (aqa != null) {
/* 50 */       ((azw)aqa).t(true);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 56 */     if (this.a == aqe.aM) {
/* 57 */       md md = ☃.o();
/* 58 */       if (md != null && md.c("BucketVariantTag", 3)) {
/* 59 */         int i = md.h("BucketVariantTag");
/* 60 */         k[] arrayOfK = { k.u, k.h };
/* 61 */         String str1 = "color.minecraft." + baw.s(i);
/* 62 */         String str2 = "color.minecraft." + baw.t(i);
/*    */         
/* 64 */         for (int j = 0; j < baw.b.length; j++) {
/* 65 */           if (i == baw.b[j]) {
/* 66 */             list.add((new of(baw.b(j))).a(arrayOfK));
/*    */             
/*    */             return;
/*    */           } 
/*    */         } 
/* 71 */         list.add((new of(baw.u(i))).a(arrayOfK));
/* 72 */         nx nx = new of(str1);
/* 73 */         if (!str1.equals(str2)) {
/* 74 */           nx.c(", ").a(new of(str2));
/*    */         }
/* 76 */         nx.a(arrayOfK);
/* 77 */         list.add(nx);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */