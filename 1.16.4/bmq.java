/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public class bmq
/*    */   extends blx
/*    */ {
/* 25 */   private static final Map<adp, bmq> a = Maps.newHashMap();
/*    */   
/*    */   private final int b;
/*    */   private final adp c;
/*    */   
/*    */   protected bmq(int ☃, adp adp1, blx.a a1) {
/* 31 */     super(a1);
/*    */     
/* 33 */     this.b = ☃;
/* 34 */     this.c = adp1;
/*    */     
/* 36 */     a.put(this.c, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 41 */     brx brx = ☃.p();
/* 42 */     fx fx = ☃.a();
/*    */     
/* 44 */     ceh ceh = brx.d_(fx);
/* 45 */     if (!ceh.a(bup.cI) || ((Boolean)ceh.c(bxs.a)).booleanValue()) {
/* 46 */       return aou.c;
/*    */     }
/*    */     
/* 49 */     bmb bmb = ☃.m();
/* 50 */     if (!brx.v) {
/* 51 */       ((bxs)bup.cI).a(brx, fx, ceh, bmb);
/* 52 */       brx.a((bfw)null, 1010, fx, blx.a(this));
/* 53 */       bmb.g(1);
/*    */       
/* 55 */       bfw bfw = ☃.n();
/* 56 */       if (bfw != null) {
/* 57 */         bfw.a(aea.ak);
/*    */       }
/*    */     } 
/* 60 */     return aou.a(brx.v);
/*    */   }
/*    */   
/*    */   public int f() {
/* 64 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 69 */     list.add(g().a(k.h));
/*    */   }
/*    */   
/*    */   public nx g() {
/* 73 */     return new of(a() + ".desc");
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static bmq a(adp ☃) {
/* 78 */     return a.get(☃);
/*    */   }
/*    */   
/*    */   public adp v() {
/* 82 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */