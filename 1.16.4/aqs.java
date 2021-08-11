/*     */ import java.util.Objects;
/*     */ import java.util.UUID;
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
/*     */ public interface aqs
/*     */ {
/*     */   int E_();
/*     */   
/*     */   void a_(int paramInt);
/*     */   
/*     */   @Nullable
/*     */   UUID F_();
/*     */   
/*     */   void a(@Nullable UUID paramUUID);
/*     */   
/*     */   void G_();
/*     */   
/*     */   default void c(md ☃) {
/*  57 */     ☃.b("AngerTime", E_());
/*  58 */     if (F_() != null) {
/*  59 */       ☃.a("AngryAt", F_());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void a(aag ☃, md md1) {
/*  67 */     a_(md1.h("AngerTime"));
/*  68 */     if (!md1.b("AngryAt")) {
/*  69 */       a((UUID)null);
/*     */       
/*     */       return;
/*     */     } 
/*  73 */     UUID uUID = md1.a("AngryAt");
/*  74 */     a(uUID);
/*     */     
/*  76 */     aqa aqa = ☃.a(uUID);
/*  77 */     if (aqa == null) {
/*     */       return;
/*     */     }
/*  80 */     if (aqa instanceof aqn) {
/*  81 */       a((aqn)aqa);
/*     */     }
/*  83 */     if (aqa.X() == aqe.bc) {
/*  84 */       e((bfw)aqa);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void a(aag ☃, boolean bool) {
/*  92 */     aqm aqm = A();
/*     */     
/*  94 */     UUID uUID = F_();
/*  95 */     if ((aqm == null || aqm.dl()) && uUID != null && ☃.a(uUID) instanceof aqn) {
/*     */ 
/*     */ 
/*     */       
/*  99 */       J_();
/*     */       
/*     */       return;
/*     */     } 
/* 103 */     if (aqm != null && !Objects.equals(uUID, aqm.bS())) {
/*     */       
/* 105 */       a(aqm.bS());
/* 106 */       G_();
/*     */     } 
/*     */ 
/*     */     
/* 110 */     if (E_() > 0 && (
/* 111 */       aqm == null || aqm.X() != aqe.bc || !bool)) {
/* 112 */       a_(E_() - 1);
/* 113 */       if (E_() == 0) {
/* 114 */         J_();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean a_(aqm ☃) {
/* 124 */     if (!aqd.f.test(☃)) {
/* 125 */       return false;
/*     */     }
/*     */     
/* 128 */     if (☃.X() == aqe.bc && a(☃.l)) {
/* 129 */       return true;
/*     */     }
/*     */     
/* 132 */     return ☃.bS().equals(F_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean a(brx ☃) {
/* 138 */     return (☃.V().b(brt.G) && H_() && F_() == null);
/*     */   }
/*     */   
/*     */   default boolean H_() {
/* 142 */     return (E_() > 0);
/*     */   }
/*     */   
/*     */   default void b(bfw ☃) {
/* 146 */     if (!☃.l.V().b(brt.F)) {
/*     */       return;
/*     */     }
/*     */     
/* 150 */     if (!☃.bS().equals(F_())) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 155 */     J_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void I_() {
/* 162 */     J_();
/* 163 */     G_();
/*     */   }
/*     */   
/*     */   default void J_() {
/* 167 */     a((aqm)null);
/* 168 */     a((UUID)null);
/* 169 */     h(null);
/* 170 */     a_(0);
/*     */   }
/*     */   
/*     */   void a(@Nullable aqm paramaqm);
/*     */   
/*     */   void e(@Nullable bfw parambfw);
/*     */   
/*     */   void h(@Nullable aqm paramaqm);
/*     */   
/*     */   @Nullable
/*     */   aqm A();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */