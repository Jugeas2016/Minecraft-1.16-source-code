/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dmh
/*     */   extends dmi
/*     */ {
/*     */   default Optional<dmi> d(double ☃, double d1) {
/*  16 */     for (dmi dmi1 : au_()) {
/*  17 */       if (dmi1.b(☃, d1)) {
/*  18 */         return Optional.of(dmi1);
/*     */       }
/*     */     } 
/*  21 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   default boolean a(double ☃, double d1, int i) {
/*  26 */     for (dmi dmi1 : au_()) {
/*  27 */       if (dmi1.a(☃, d1, i)) {
/*  28 */         a(dmi1);
/*  29 */         if (i == 0) {
/*  30 */           b_(true);
/*     */         }
/*  32 */         return true;
/*     */       } 
/*     */     } 
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   default boolean c(double ☃, double d1, int i) {
/*  40 */     b_(false);
/*  41 */     return d(☃, d1).filter(dmi1 -> dmi1.c(☃, d1, i)).isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   default boolean a(double ☃, double d1, int i, double d2, double d3) {
/*  46 */     if (aw_() != null && av_() && i == 0) {
/*  47 */       return aw_().a(☃, d1, i, d2, d3);
/*     */     }
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean a(double ☃, double d1, double d2) {
/*  58 */     return d(☃, d1).filter(dmi1 -> dmi1.a(☃, d1, d2)).isPresent();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean a(int ☃, int i, int j) {
/*  64 */     return (aw_() != null && aw_().a(☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   default boolean b(int ☃, int i, int j) {
/*  69 */     return (aw_() != null && aw_().b(☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   default boolean a(char ☃, int i) {
/*  74 */     return (aw_() != null && aw_().a(☃, i));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void b(@Nullable dmi ☃) {
/*  83 */     a(☃);
/*  84 */     ☃.c_(true);
/*     */   }
/*     */   
/*     */   default void c(@Nullable dmi ☃) {
/*  88 */     a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean c_(boolean ☃) {
/*     */     int i;
/*  99 */     dmi dmi1 = aw_();
/*     */     
/* 101 */     boolean bool = (dmi1 != null);
/* 102 */     if (bool && 
/* 103 */       dmi1.c_(☃)) {
/* 104 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 108 */     List<? extends dmi> list = au_();
/*     */ 
/*     */     
/* 111 */     int j = list.indexOf(dmi1);
/* 112 */     if (bool && j >= 0) {
/* 113 */       i = j + (☃ ? 1 : 0);
/*     */     }
/* 115 */     else if (☃) {
/* 116 */       i = 0;
/*     */     } else {
/* 118 */       i = list.size();
/*     */     } 
/*     */ 
/*     */     
/* 122 */     ListIterator<? extends dmi> listIterator = list.listIterator(i);
/*     */     
/* 124 */     BooleanSupplier booleanSupplier = ☃ ? listIterator::hasNext : listIterator::hasPrevious;
/* 125 */     Supplier<? extends dmi> supplier = ☃ ? listIterator::next : listIterator::previous;
/*     */     
/* 127 */     while (booleanSupplier.getAsBoolean()) {
/* 128 */       dmi dmi2 = supplier.get();
/* 129 */       if (dmi2.c_(☃)) {
/* 130 */         a(dmi2);
/* 131 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 135 */     a(null);
/* 136 */     return false;
/*     */   }
/*     */   
/*     */   List<? extends dmi> au_();
/*     */   
/*     */   boolean av_();
/*     */   
/*     */   void b_(boolean paramBoolean);
/*     */   
/*     */   @Nullable
/*     */   dmi aw_();
/*     */   
/*     */   void a(@Nullable dmi paramdmi);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */