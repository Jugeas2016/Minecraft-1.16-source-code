/*    */ import com.google.common.collect.ComparisonChain;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Ordering;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
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
/*    */ public class dsv
/*    */   implements dsr, dss
/*    */ {
/*    */   private static final Ordering<dwx> a;
/*    */   
/*    */   static {
/* 23 */     a = Ordering.from((☃, dwx1) -> ComparisonChain.start().compare(☃.a().getId(), dwx1.a().getId()).result());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 28 */   private static final nr b = new of("spectatorMenu.teleport");
/* 29 */   private static final nr c = new of("spectatorMenu.teleport.prompt");
/*    */   
/* 31 */   private final List<dss> d = Lists.newArrayList();
/*    */   
/*    */   public dsv() {
/* 34 */     this(a.sortedCopy(djz.C().w().e()));
/*    */   }
/*    */   
/*    */   public dsv(Collection<dwx> ☃) {
/* 38 */     for (dwx dwx : a.sortedCopy(☃)) {
/* 39 */       if (dwx.b() != bru.e) {
/* 40 */         this.d.add(new dso(dwx.a()));
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public List<dss> a() {
/* 47 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public nr b() {
/* 52 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dsq ☃) {
/* 57 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr aA_() {
/* 62 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, float f, int i) {
/* 67 */     djz.C().M().a(dml.a);
/* 68 */     dkw.a(☃, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean aB_() {
/* 73 */     return !this.d.isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */