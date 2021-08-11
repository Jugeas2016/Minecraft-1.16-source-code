/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.util.Objects;
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
/*     */ public final class a
/*     */   extends ajn.b
/*     */ {
/*     */   @Nullable
/*     */   private IntSet e;
/*     */   
/*     */   public a(Typed<?> ☃, Schema schema) {
/* 117 */     super(☃, schema);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/* 122 */     this.e = (IntSet)new IntOpenHashSet();
/*     */     
/* 124 */     for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 125 */       Dynamic<?> dynamic = this.b.get(☃);
/* 126 */       String str = dynamic.get("Name").asString("");
/* 127 */       if (Objects.equals(str, "minecraft:trapped_chest")) {
/* 128 */         this.e.add(☃);
/*     */       }
/*     */     } 
/*     */     
/* 132 */     return this.e.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 136 */     return this.e.contains(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */