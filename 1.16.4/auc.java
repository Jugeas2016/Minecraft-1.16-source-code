/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auc
/*    */   extends arv<bfj>
/*    */ {
/*    */   private final ayd<List<gf>> b;
/*    */   private final ayd<gf> c;
/*    */   private final float d;
/*    */   private final int e;
/*    */   private final int f;
/*    */   private long g;
/*    */   @Nullable
/*    */   private gf h;
/*    */   
/*    */   public auc(ayd<List<gf>> ☃, float f, int i, int j, ayd<gf> ayd1) {
/* 27 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ☃, aye.a, ayd1, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     this.b = ☃;
/* 34 */     this.d = f;
/* 35 */     this.e = i;
/* 36 */     this.f = j;
/* 37 */     this.c = ayd1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 42 */     Optional<List<gf>> optional = bfj1.cJ().c(this.b);
/* 43 */     Optional<gf> optional1 = bfj1.cJ().c(this.c);
/* 44 */     if (optional.isPresent() && optional1.isPresent()) {
/* 45 */       List<gf> list = optional.get();
/* 46 */       if (!list.isEmpty()) {
/* 47 */         this.h = list.get(☃.u_().nextInt(list.size()));
/* 48 */         return (this.h != null && ☃.Y() == this.h.a() && ((gf)optional1.get()).b().a(bfj1.cA(), this.f));
/*    */       } 
/*    */     } 
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 56 */     if (l > this.g && this.h != null) {
/* 57 */       bfj1.cJ().a(ayd.m, new ayf(this.h.b(), this.d, this.e));
/* 58 */       this.g = l + 100L;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */