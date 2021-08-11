/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Maps;
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
/*    */ public class blu
/*    */   extends bkv
/*    */ {
/* 22 */   private static final Set<buo> c = (Set<buo>)ImmutableSet.of(bup.iK, bup.mn, bup.gA, bup.ke, bup.nb, bup.mw, (Object[])new buo[] { bup.an, bup.ao, bup.ak, bup.ah, bup.ai, bup.am, bup.al, bup.aj });
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
/* 39 */   protected static final Map<buo, ceh> a = Maps.newHashMap((Map)ImmutableMap.of(bup.i, bup.bX
/* 40 */         .n(), bup.iE, bup.bX
/* 41 */         .n(), bup.j, bup.bX
/* 42 */         .n(), bup.k, bup.j
/* 43 */         .n()));
/*    */ 
/*    */   
/*    */   protected blu(bnh ☃, int i, float f, blx.a a1) {
/* 47 */     super(i, f, ☃, c, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 52 */     brx brx = ☃.p();
/* 53 */     fx fx = ☃.a();
/*    */     
/* 55 */     if (☃.j() != gc.a && brx.d_(fx.b()).g()) {
/* 56 */       ceh ceh = a.get(brx.d_(fx).b());
/*    */       
/* 58 */       if (ceh != null) {
/* 59 */         bfw bfw = ☃.n();
/* 60 */         brx.a(bfw, fx, adq.fA, adr.e, 1.0F, 1.0F);
/*    */         
/* 62 */         if (!brx.v) {
/* 63 */           brx.a(fx, ceh, 11);
/* 64 */           if (bfw != null) {
/* 65 */             ☃.m().a(1, bfw, bfw1 -> bfw1.d(☃.o()));
/*    */           }
/*    */         } 
/* 68 */         return aou.a(brx.v);
/*    */       } 
/*    */     } 
/*    */     
/* 72 */     return aou.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */