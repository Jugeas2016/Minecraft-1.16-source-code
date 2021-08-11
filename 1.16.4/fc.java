/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
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
/*     */ public class fc
/*     */ {
/*     */   private final int a;
/*     */   private final boolean b;
/*     */   private final boolean c;
/*     */   private final Predicate<aqa> d;
/*     */   private final bz.c e;
/*     */   private final Function<dcn, dcn> f;
/*     */   @Nullable
/*     */   private final dci g;
/*     */   private final BiConsumer<dcn, List<? extends aqa>> h;
/*     */   private final boolean i;
/*     */   @Nullable
/*     */   private final String j;
/*     */   @Nullable
/*     */   private final UUID k;
/*     */   @Nullable
/*     */   private final aqe<?> l;
/*     */   private final boolean m;
/*     */   
/*     */   public fc(int ☃, boolean bool1, boolean bool2, Predicate<aqa> predicate, bz.c c1, Function<dcn, dcn> function, @Nullable dci dci1, BiConsumer<dcn, List<? extends aqa>> biConsumer, boolean bool3, @Nullable String str, @Nullable UUID uUID, @Nullable aqe<?> aqe1, boolean bool4) {
/*  48 */     this.a = ☃;
/*  49 */     this.b = bool1;
/*  50 */     this.c = bool2;
/*  51 */     this.d = predicate;
/*  52 */     this.e = c1;
/*  53 */     this.f = function;
/*  54 */     this.g = dci1;
/*  55 */     this.h = biConsumer;
/*  56 */     this.i = bool3;
/*  57 */     this.j = str;
/*  58 */     this.k = uUID;
/*  59 */     this.l = aqe1;
/*  60 */     this.m = bool4;
/*     */   }
/*     */   
/*     */   public int a() {
/*  64 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  68 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  72 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  76 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void e(db ☃) throws CommandSyntaxException {
/*  84 */     if (this.m && !☃.c(2)) {
/*  85 */       throw dk.f.create();
/*     */     }
/*     */   }
/*     */   
/*     */   public aqa a(db ☃) throws CommandSyntaxException {
/*  90 */     e(☃);
/*     */     
/*  92 */     List<? extends aqa> list = b(☃);
/*  93 */     if (list.isEmpty()) {
/*  94 */       throw dk.d.create();
/*     */     }
/*  96 */     if (list.size() > 1) {
/*  97 */       throw dk.a.create();
/*     */     }
/*  99 */     return list.get(0);
/*     */   }
/*     */   
/*     */   public List<? extends aqa> b(db ☃) throws CommandSyntaxException {
/* 103 */     e(☃);
/*     */     
/* 105 */     if (!this.b) {
/* 106 */       return (List)d(☃);
/*     */     }
/* 108 */     if (this.j != null) {
/* 109 */       aah aah = ☃.j().ae().a(this.j);
/* 110 */       if (aah == null) {
/* 111 */         return Collections.emptyList();
/*     */       }
/* 113 */       return Lists.newArrayList((Object[])new aah[] { aah });
/*     */     } 
/* 115 */     if (this.k != null) {
/* 116 */       for (aag aag : ☃.j().G()) {
/* 117 */         aqa aqa = aag.a(this.k);
/* 118 */         if (aqa != null) {
/* 119 */           return Lists.newArrayList((Object[])new aqa[] { aqa });
/*     */         }
/*     */       } 
/* 122 */       return Collections.emptyList();
/*     */     } 
/* 124 */     dcn dcn = this.f.apply(☃.d());
/* 125 */     Predicate<aqa> predicate = a(dcn);
/*     */     
/* 127 */     if (this.i) {
/* 128 */       if (☃.f() != null && predicate.test(☃.f())) {
/* 129 */         return Lists.newArrayList((Object[])new aqa[] { ☃.f() });
/*     */       }
/* 131 */       return Collections.emptyList();
/*     */     } 
/*     */ 
/*     */     
/* 135 */     List<aqa> list = Lists.newArrayList();
/*     */     
/* 137 */     if (d()) {
/* 138 */       a(list, ☃.e(), dcn, predicate);
/*     */     } else {
/* 140 */       for (aag aag : ☃.j().G()) {
/* 141 */         a(list, aag, dcn, predicate);
/*     */       }
/*     */     } 
/*     */     
/* 145 */     return a(dcn, list);
/*     */   }
/*     */   
/*     */   private void a(List<aqa> ☃, aag aag1, dcn dcn1, Predicate<aqa> predicate) {
/* 149 */     if (this.g != null) {
/* 150 */       ☃.addAll((Collection)aag1.a(this.l, this.g.c(dcn1), predicate));
/*     */     } else {
/* 152 */       ☃.addAll(aag1.a(this.l, predicate));
/*     */     } 
/*     */   }
/*     */   
/*     */   public aah c(db ☃) throws CommandSyntaxException {
/* 157 */     e(☃);
/*     */     
/* 159 */     List<aah> list = d(☃);
/* 160 */     if (list.size() != 1) {
/* 161 */       throw dk.e.create();
/*     */     }
/* 163 */     return list.get(0);
/*     */   }
/*     */   public List<aah> d(db ☃) throws CommandSyntaxException {
/*     */     List<aah> list;
/* 167 */     e(☃);
/*     */     
/* 169 */     if (this.j != null) {
/* 170 */       aah aah = ☃.j().ae().a(this.j);
/* 171 */       if (aah == null) {
/* 172 */         return Collections.emptyList();
/*     */       }
/* 174 */       return Lists.newArrayList((Object[])new aah[] { aah });
/*     */     } 
/* 176 */     if (this.k != null) {
/* 177 */       aah aah = ☃.j().ae().a(this.k);
/* 178 */       if (aah == null) {
/* 179 */         return Collections.emptyList();
/*     */       }
/* 181 */       return Lists.newArrayList((Object[])new aah[] { aah });
/*     */     } 
/*     */ 
/*     */     
/* 185 */     dcn dcn = this.f.apply(☃.d());
/* 186 */     Predicate<aqa> predicate = a(dcn);
/*     */     
/* 188 */     if (this.i) {
/* 189 */       if (☃.f() instanceof aah) {
/* 190 */         aah aah = (aah)☃.f();
/* 191 */         if (predicate.test(aah)) {
/* 192 */           return Lists.newArrayList((Object[])new aah[] { aah });
/*     */         }
/*     */       } 
/* 195 */       return Collections.emptyList();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 200 */     if (d()) {
/* 201 */       list = ☃.e().a(predicate::test);
/*     */     } else {
/* 203 */       list = Lists.newArrayList();
/* 204 */       for (aah aah : ☃.j().ae().s()) {
/* 205 */         if (predicate.test(aah)) {
/* 206 */           list.add(aah);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 211 */     return a(dcn, list);
/*     */   }
/*     */   
/*     */   private Predicate<aqa> a(dcn ☃) {
/* 215 */     Predicate<aqa> predicate = this.d;
/* 216 */     if (this.g != null) {
/* 217 */       dci dci1 = this.g.c(☃);
/* 218 */       predicate = predicate.and(aqa1 -> ☃.c(aqa1.cc()));
/*     */     } 
/*     */     
/* 221 */     if (!this.e.c()) {
/* 222 */       predicate = predicate.and(aqa1 -> this.e.a(aqa1.e(☃)));
/*     */     }
/* 224 */     return predicate;
/*     */   }
/*     */   
/*     */   private <T extends aqa> List<T> a(dcn ☃, List<T> list) {
/* 228 */     if (list.size() > 1) {
/* 229 */       this.h.accept(☃, list);
/*     */     }
/*     */     
/* 232 */     return list.subList(0, Math.min(this.a, list.size()));
/*     */   }
/*     */   
/*     */   public static nx a(List<? extends aqa> ☃) {
/* 236 */     return ns.b(☃, aqa::d);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */