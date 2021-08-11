/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.EnumSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
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
/*    */ public class awq<T extends bhc>
/*    */   extends avv
/*    */ {
/*    */   private final T a;
/*    */   
/*    */   public awq(T ☃) {
/* 21 */     this.a = ☃;
/* 22 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     return (this.a.A() == null && 
/* 28 */       !this.a.bs() && this.a
/* 29 */       .fb() && 
/* 30 */       !this.a.fa().a() && 
/* 31 */       !((aag)((bhc)this.a).l).a_(this.a.cB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 36 */     return (this.a.fb() && 
/* 37 */       !this.a.fa().a() && ((bhc)this.a).l instanceof aag && 
/*    */       
/* 39 */       !((aag)((bhc)this.a).l).a_(this.a.cB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 44 */     if (this.a.fb()) {
/* 45 */       bhb ☃ = this.a.fa();
/* 46 */       if (((bhc)this.a).K % 20 == 0) {
/* 47 */         a(☃);
/*    */       }
/*    */       
/* 50 */       if (!this.a.eI()) {
/* 51 */         dcn dcn = azj.b((aqu)this.a, 15, 4, dcn.c(☃.t()));
/* 52 */         if (dcn != null) {
/* 53 */           this.a.x().a(dcn.b, dcn.c, dcn.d, 1.0D);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(bhb ☃) {
/* 60 */     if (☃.v()) {
/* 61 */       Set<bhc> set = Sets.newHashSet();
/*    */       
/* 63 */       List<bhc> list = ((bhc)this.a).l.a(bhc.class, this.a.cc().g(16.0D), bhc1 -> (!bhc1.fb() && bhd.a(bhc1, ☃)));
/* 64 */       set.addAll(list);
/*    */       
/* 66 */       for (bhc bhc1 : set)
/* 67 */         ☃.a(☃.k(), bhc1, null, true); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */