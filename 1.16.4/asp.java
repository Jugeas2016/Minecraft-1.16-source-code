/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asp
/*     */   extends arv<aqm>
/*     */ {
/*     */   @Nullable
/*     */   private cxb b;
/*     */   private int c;
/*     */   
/*     */   public asp() {
/*  42 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.t, aye.a, ayd.v, aye.c));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, aqm aqm1) {
/*  50 */     cxd cxd = aqm1.cJ().<cxd>c(ayd.t).get();
/*  51 */     if (cxd.b() || cxd.c()) {
/*  52 */       return false;
/*     */     }
/*  54 */     if (!Objects.equals(this.b, cxd.h())) {
/*     */       
/*  56 */       this.c = 20;
/*  57 */       return true;
/*     */     } 
/*  59 */     if (this.c > 0) {
/*  60 */       this.c--;
/*     */     }
/*  62 */     return (this.c == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, aqm aqm1, long l) {
/*  67 */     cxd cxd = aqm1.cJ().<cxd>c(ayd.t).get();
/*  68 */     this.b = cxd.h();
/*     */     
/*  70 */     cxb cxb1 = cxd.i();
/*  71 */     cxb cxb2 = cxd.h();
/*     */     
/*  73 */     fx fx1 = cxb1.a();
/*  74 */     ceh ceh1 = ☃.d_(fx1);
/*  75 */     if (ceh1.a(aed.h)) {
/*  76 */       bwb bwb = (bwb)ceh1.b();
/*  77 */       if (!bwb.h(ceh1)) {
/*  78 */         bwb.a(☃, ceh1, fx1, true);
/*     */       }
/*  80 */       c(☃, aqm1, fx1);
/*     */     } 
/*     */     
/*  83 */     fx fx2 = cxb2.a();
/*  84 */     ceh ceh2 = ☃.d_(fx2);
/*  85 */     if (ceh2.a(aed.h)) {
/*  86 */       bwb bwb = (bwb)ceh2.b();
/*  87 */       if (!bwb.h(ceh2)) {
/*     */         
/*  89 */         bwb.a(☃, ceh2, fx2, true);
/*  90 */         c(☃, aqm1, fx2);
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     a(☃, aqm1, cxb1, cxb2);
/*     */   }
/*     */   
/*     */   public static void a(aag ☃, aqm aqm1, @Nullable cxb cxb1, @Nullable cxb cxb2) {
/*  98 */     arf<?> arf = aqm1.cJ();
/*     */     
/* 100 */     if (arf.a(ayd.v)) {
/* 101 */       Iterator<gf> iterator = ((Set<gf>)arf.<Set<gf>>c(ayd.v).get()).iterator();
/* 102 */       while (iterator.hasNext()) {
/* 103 */         gf gf = iterator.next();
/* 104 */         fx fx = gf.b();
/*     */ 
/*     */         
/* 107 */         if (cxb1 != null && cxb1.a().equals(fx)) {
/*     */           continue;
/*     */         }
/* 110 */         if (cxb2 != null && cxb2.a().equals(fx)) {
/*     */           continue;
/*     */         }
/*     */         
/* 114 */         if (a(☃, aqm1, gf)) {
/* 115 */           iterator.remove();
/*     */           continue;
/*     */         } 
/* 118 */         ceh ceh = ☃.d_(fx);
/* 119 */         if (!ceh.a(aed.h)) {
/* 120 */           iterator.remove();
/*     */           continue;
/*     */         } 
/* 123 */         bwb bwb = (bwb)ceh.b();
/* 124 */         if (!bwb.h(ceh)) {
/* 125 */           iterator.remove();
/*     */           continue;
/*     */         } 
/* 128 */         if (a(☃, aqm1, fx)) {
/* 129 */           iterator.remove();
/*     */           continue;
/*     */         } 
/* 132 */         bwb.a(☃, ceh, fx, false);
/* 133 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(aag ☃, aqm aqm1, fx fx1) {
/* 139 */     arf<?> arf = aqm1.cJ();
/* 140 */     if (!arf.a(ayd.g)) {
/* 141 */       return false;
/*     */     }
/*     */     
/* 144 */     return ((List)arf.<List>c((ayd)ayd.g).get()).stream()
/* 145 */       .filter(aqm1 -> (aqm1.X() == ☃.X()))
/* 146 */       .filter(aqm1 -> ☃.a(aqm1.cA(), 2.0D))
/* 147 */       .anyMatch(aqm1 -> b(☃, aqm1, fx1));
/*     */   }
/*     */   
/*     */   private static boolean b(aag ☃, aqm aqm1, fx fx1) {
/* 151 */     if (!aqm1.cJ().a(ayd.t)) {
/* 152 */       return false;
/*     */     }
/* 154 */     cxd cxd = aqm1.cJ().<cxd>c(ayd.t).get();
/* 155 */     if (cxd.c())
/*     */     {
/* 157 */       return false;
/*     */     }
/*     */     
/* 160 */     cxb cxb1 = cxd.i();
/* 161 */     if (cxb1 == null) {
/* 162 */       return false;
/*     */     }
/*     */     
/* 165 */     cxb cxb2 = cxd.h();
/* 166 */     return (fx1.equals(cxb1.a()) || fx1.equals(cxb2.a()));
/*     */   }
/*     */   
/*     */   private static boolean a(aag ☃, aqm aqm1, gf gf1) {
/* 170 */     return (gf1.a() != ☃.Y() || 
/* 171 */       !gf1.b().a(aqm1.cA(), 2.0D));
/*     */   }
/*     */   
/*     */   private void c(aag ☃, aqm aqm1, fx fx1) {
/* 175 */     arf<?> arf = aqm1.cJ();
/* 176 */     gf gf = gf.a(☃.Y(), fx1);
/* 177 */     if (arf.<Set<gf>>c(ayd.v).isPresent()) {
/* 178 */       ((Set<gf>)arf.<Set<gf>>c(ayd.v).get()).add(gf);
/*     */     } else {
/* 180 */       arf.a(ayd.v, Sets.newHashSet((Object[])new gf[] { gf }));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */