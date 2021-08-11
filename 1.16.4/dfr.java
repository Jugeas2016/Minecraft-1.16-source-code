/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*    */ import it.unimi.dsi.fastutil.ints.IntList;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfr
/*    */ {
/*    */   private final ImmutableList<dfs> a;
/* 13 */   private final IntList b = (IntList)new IntArrayList();
/*    */   private final int c;
/*    */   
/*    */   public dfr(ImmutableList<dfs> ☃) {
/* 17 */     this.a = ☃;
/*    */ 
/*    */     
/* 20 */     int i = 0;
/* 21 */     for (UnmodifiableIterator<dfs> unmodifiableIterator = ☃.iterator(); unmodifiableIterator.hasNext(); ) { dfs dfs = unmodifiableIterator.next();
/* 22 */       this.b.add(i);
/* 23 */       i += dfs.d(); }
/*    */     
/* 25 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return "format: " + this.a.size() + " elements: " + (String)this.a.stream().map(Object::toString).collect(Collectors.joining(" "));
/*    */   }
/*    */   
/*    */   public int a() {
/* 34 */     return b() / 4;
/*    */   }
/*    */   
/*    */   public int b() {
/* 38 */     return this.c;
/*    */   }
/*    */   
/*    */   public ImmutableList<dfs> c() {
/* 42 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 47 */     if (this == ☃) {
/* 48 */       return true;
/*    */     }
/* 50 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 51 */       return false;
/*    */     }
/*    */     
/* 54 */     dfr dfr1 = (dfr)☃;
/*    */     
/* 56 */     if (this.c != dfr1.c) {
/* 57 */       return false;
/*    */     }
/*    */     
/* 60 */     return this.a.equals(dfr1.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 65 */     return this.a.hashCode();
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 69 */     if (!RenderSystem.isOnRenderThread()) {
/* 70 */       RenderSystem.recordRenderCall(() -> a(☃));
/*    */       return;
/*    */     } 
/* 73 */     int i = b();
/* 74 */     ImmutableList<dfs> immutableList = c();
/* 75 */     for (int j = 0; j < immutableList.size(); j++) {
/* 76 */       ((dfs)immutableList.get(j)).a(☃ + this.b.getInt(j), i);
/*    */     }
/*    */   }
/*    */   
/*    */   public void d() {
/* 81 */     if (!RenderSystem.isOnRenderThread()) {
/* 82 */       RenderSystem.recordRenderCall(this::d);
/*    */       return;
/*    */     } 
/* 85 */     for (UnmodifiableIterator<dfs> unmodifiableIterator = c().iterator(); unmodifiableIterator.hasNext(); ) { dfs ☃ = unmodifiableIterator.next();
/* 86 */       ☃.e(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */