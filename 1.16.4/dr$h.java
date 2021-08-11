/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
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
/*     */ public class h
/*     */ {
/*     */   private final String a;
/*     */   private final Object2IntMap<dr.i> b;
/*     */   private final dr.i[] c;
/*     */   
/*     */   public h(String ☃, dr.i[] arrayOfI, Object2IntMap<dr.i> object2IntMap) {
/* 143 */     this.a = ☃;
/* 144 */     this.c = arrayOfI;
/* 145 */     this.b = object2IntMap;
/*     */   }
/*     */   
/*     */   public List<mt> a(mt ☃) throws CommandSyntaxException {
/* 149 */     List<mt> list = Collections.singletonList(☃);
/* 150 */     for (dr.i i1 : this.c) {
/* 151 */       list = i1.a(list);
/* 152 */       if (list.isEmpty()) {
/* 153 */         throw a(i1);
/*     */       }
/*     */     } 
/* 156 */     return list;
/*     */   }
/*     */   
/*     */   public int b(mt ☃) {
/* 160 */     List<mt> list = Collections.singletonList(☃);
/* 161 */     for (dr.i i1 : this.c) {
/* 162 */       list = i1.a(list);
/* 163 */       if (list.isEmpty()) {
/* 164 */         return 0;
/*     */       }
/*     */     } 
/* 167 */     return list.size();
/*     */   }
/*     */   
/*     */   private List<mt> d(mt ☃) throws CommandSyntaxException {
/* 171 */     List<mt> list = Collections.singletonList(☃);
/*     */     
/* 173 */     for (int j = 0; j < this.c.length - 1; j++) {
/* 174 */       dr.i i1 = this.c[j];
/* 175 */       int k = j + 1;
/* 176 */       list = i1.a(list, this.c[k]::a);
/* 177 */       if (list.isEmpty()) {
/* 178 */         throw a(i1);
/*     */       }
/*     */     } 
/* 181 */     return list;
/*     */   }
/*     */   
/*     */   public List<mt> a(mt ☃, Supplier<mt> supplier) throws CommandSyntaxException {
/* 185 */     List<mt> list = d(☃);
/*     */     
/* 187 */     dr.i i1 = this.c[this.c.length - 1];
/* 188 */     return i1.a(list, supplier);
/*     */   }
/*     */   
/*     */   private static int a(List<mt> ☃, Function<mt, Integer> function) {
/* 192 */     return ((Integer)☃.stream().<Integer>map(function).reduce(Integer.valueOf(0), (☃, integer1) -> Integer.valueOf(☃.intValue() + integer1.intValue()))).intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(mt ☃, Supplier<mt> supplier) throws CommandSyntaxException {
/* 200 */     List<mt> list = d(☃);
/*     */     
/* 202 */     dr.i i1 = this.c[this.c.length - 1];
/* 203 */     return a(list, mt1 -> Integer.valueOf(☃.a(mt1, supplier)));
/*     */   }
/*     */   
/*     */   public int c(mt ☃) {
/* 207 */     List<mt> list = Collections.singletonList(☃);
/*     */     
/* 209 */     for (int j = 0; j < this.c.length - 1; j++) {
/* 210 */       list = this.c[j].a(list);
/*     */     }
/*     */     
/* 213 */     dr.i i1 = this.c[this.c.length - 1];
/* 214 */     return a(list, i1::a);
/*     */   }
/*     */   
/*     */   private CommandSyntaxException a(dr.i ☃) {
/* 218 */     int j = this.b.getInt(☃);
/* 219 */     return dr.b.create(this.a.substring(0, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 224 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dr$h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */