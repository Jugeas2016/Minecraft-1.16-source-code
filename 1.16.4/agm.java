/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.List;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.List;
/*     */ import java.util.stream.LongStream;
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
/*     */ public class agm
/*     */   extends DataFix
/*     */ {
/*     */   public agm(Schema ☃) {
/*  28 */     super(☃, false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  33 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/*  34 */     Type<?> type1 = ☃.findFieldType("Level");
/*     */     
/*  36 */     OpticFinder<?> opticFinder1 = DSL.fieldFinder("Level", type1);
/*  37 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Sections");
/*     */     
/*  39 */     Type<?> type2 = ((List.ListType)opticFinder2.type()).getElement();
/*  40 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type2);
/*     */     
/*  42 */     Type<Pair<String, Dynamic<?>>> type = DSL.named(akn.m.typeName(), DSL.remainderType());
/*  43 */     OpticFinder<List<Pair<String, Dynamic<?>>>> opticFinder = DSL.fieldFinder("Palette", (Type)DSL.list(type));
/*     */     
/*  45 */     return fixTypeEverywhereTyped("BitStorageAlignFix", ☃, getOutputSchema().getType(akn.c), typed -> typed.updateTyped(☃, ()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃) {
/*  53 */     return ☃.update(DSL.remainderFinder(), ☃ -> ☃.update("Heightmaps", ()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Typed<?> a(OpticFinder<?> ☃, OpticFinder<?> opticFinder1, OpticFinder<List<Pair<String, Dynamic<?>>>> opticFinder, Typed<?> typed) {
/*  65 */     return typed.updateTyped(☃, typed -> typed.updateTyped(☃, ()));
/*     */   }
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
/*     */   private static Dynamic<?> a(Dynamic<?> ☃, Dynamic<?> dynamic1, int i, int j) {
/*  81 */     long[] arrayOfLong1 = dynamic1.asLongStream().toArray();
/*  82 */     long[] arrayOfLong2 = a(i, j, arrayOfLong1);
/*  83 */     return ☃.createLongList(LongStream.of(arrayOfLong2));
/*     */   }
/*     */   
/*     */   public static long[] a(int ☃, int i, long[] arrayOfLong) {
/*  87 */     int j = arrayOfLong.length;
/*  88 */     if (j == 0) {
/*  89 */       return arrayOfLong;
/*     */     }
/*     */     
/*  92 */     long l1 = (1L << i) - 1L;
/*  93 */     int k = 64 / i;
/*  94 */     int m = (☃ + k - 1) / k;
/*     */     
/*  96 */     long[] arrayOfLong1 = new long[m];
/*     */     
/*  98 */     int n = 0;
/*  99 */     int i1 = 0;
/* 100 */     long l2 = 0L;
/*     */     
/* 102 */     int i2 = 0;
/* 103 */     long l3 = arrayOfLong[0];
/* 104 */     long l4 = (j > 1) ? arrayOfLong[1] : 0L;
/*     */     
/* 106 */     for (int i3 = 0; i3 < ☃; i3++) {
/* 107 */       long l; int i4 = i3 * i;
/* 108 */       int i5 = i4 >> 6;
/* 109 */       int i6 = (i3 + 1) * i - 1 >> 6;
/* 110 */       int i7 = i4 ^ i5 << 6;
/*     */       
/* 112 */       if (i5 != i2) {
/* 113 */         l3 = l4;
/* 114 */         l4 = (i5 + 1 < j) ? arrayOfLong[i5 + 1] : 0L;
/* 115 */         i2 = i5;
/*     */       } 
/*     */ 
/*     */       
/* 119 */       if (i5 == i6) {
/* 120 */         l = l3 >>> i7 & l1;
/*     */       } else {
/* 122 */         int i9 = 64 - i7;
/* 123 */         l = (l3 >>> i7 | l4 << i9) & l1;
/*     */       } 
/*     */       
/* 126 */       int i8 = i1 + i;
/* 127 */       if (i8 >= 64) {
/* 128 */         arrayOfLong1[n++] = l2;
/* 129 */         l2 = l;
/* 130 */         i1 = i;
/*     */       } else {
/* 132 */         l2 |= l << i1;
/* 133 */         i1 = i8;
/*     */       } 
/*     */     } 
/* 136 */     if (l2 != 0L) {
/* 137 */       arrayOfLong1[n] = l2;
/*     */     }
/*     */     
/* 140 */     return arrayOfLong1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */