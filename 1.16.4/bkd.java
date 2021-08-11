/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bkd
/*    */   extends bkv
/*    */ {
/* 22 */   private static final Set<cva> c = Sets.newHashSet((Object[])new cva[] { cva.y, cva.z, cva.e, cva.g, cva.B, cva.P });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   private static final Set<buo> d = Sets.newHashSet((Object[])new buo[] { bup.cg, bup.lQ, bup.eW, bup.eX, bup.eY, bup.eZ, bup.fb, bup.fa, bup.mQ, bup.mR });
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
/* 44 */   protected static final Map<buo, buo> a = (Map<buo, buo>)(new ImmutableMap.Builder())
/* 45 */     .put(bup.V, bup.ab)
/* 46 */     .put(bup.J, bup.U)
/* 47 */     .put(bup.aa, bup.ag)
/* 48 */     .put(bup.O, bup.T)
/* 49 */     .put(bup.Z, bup.af)
/* 50 */     .put(bup.N, bup.S)
/* 51 */     .put(bup.X, bup.ad)
/* 52 */     .put(bup.L, bup.Q)
/* 53 */     .put(bup.Y, bup.ae)
/* 54 */     .put(bup.M, bup.R)
/* 55 */     .put(bup.W, bup.ac)
/* 56 */     .put(bup.K, bup.P)
/* 57 */     .put(bup.mh, bup.mi)
/* 58 */     .put(bup.mj, bup.mk)
/* 59 */     .put(bup.mq, bup.mr)
/* 60 */     .put(bup.ms, bup.mt)
/* 61 */     .build();
/*    */   
/*    */   protected bkd(bnh ☃, float f1, float f2, blx.a a1) {
/* 64 */     super(f1, f2, ☃, d, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(bmb ☃, ceh ceh1) {
/* 69 */     cva cva = ceh1.c();
/* 70 */     if (c.contains(cva)) {
/* 71 */       return this.b;
/*    */     }
/* 73 */     return super.a(☃, ceh1);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 78 */     brx brx = ☃.p();
/* 79 */     fx fx = ☃.a();
/* 80 */     ceh ceh = brx.d_(fx);
/* 81 */     buo buo = a.get(ceh.b());
/*    */     
/* 83 */     if (buo != null) {
/* 84 */       bfw bfw = ☃.n();
/* 85 */       brx.a(bfw, fx, adq.Z, adr.e, 1.0F, 1.0F);
/*    */       
/* 87 */       if (!brx.v) {
/* 88 */         brx.a(fx, buo.n().a(bzl.e, ceh.c(bzl.e)), 11);
/*    */         
/* 90 */         if (bfw != null) {
/* 91 */           ☃.m().a(1, bfw, bfw1 -> bfw1.d(☃.o()));
/*    */         }
/*    */       } 
/* 94 */       return aou.a(brx.v);
/*    */     } 
/*    */     
/* 97 */     return aou.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */