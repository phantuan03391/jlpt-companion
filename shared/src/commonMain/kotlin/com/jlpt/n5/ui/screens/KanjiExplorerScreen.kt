package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.screens.kanji.components.KanjiDetailDialog
import com.jlpt.n5.ui.screens.kanji.components.KanjiGridCard
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.KanjiViewModel

@Composable
fun KanjiExplorerScreen(
    viewModel: KanjiViewModel = remember { KanjiViewModel() },
    onOpenFlashcardKanji: () -> Unit
) {
    val focusManager = LocalFocusManager.current
    val state by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                focusManager.clearFocus()
            }
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "104 Hán Tự Kanji N5",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary
                )
                Text(
                    text = "Toàn bộ chữ Hán cơ bản nhất kèm thứ tự nét vẽ",
                    fontSize = 13.sp,
                    color = MaterialTheme.colors.textSecondary
                )
            }

            Button(
                onClick = {
                    focusManager.clearFocus()
                    onOpenFlashcardKanji()
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    "🗂️ Ôn thẻ",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = androidx.compose.ui.graphics.Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = state.searchQuery,
            onValueChange = { viewModel.setSearchQuery(it) },
            placeholder = {
                Text(
                    "Tìm theo Kanji, Hán Việt, âm On/Kun, ý nghĩa...",
                    color = MaterialTheme.colors.textMuted,
                    fontSize = 13.sp
                )
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            trailingIcon = {
                if (state.searchQuery.isNotEmpty()) {
                    IconButton(onClick = {
                        viewModel.setSearchQuery("")
                        focusManager.clearFocus()
                    }) {
                        Text(
                            text = "✕",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textMuted
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                textColor = MaterialTheme.colors.textPrimary,
                cursorColor = MaterialTheme.colors.primary,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.outlineBorder
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tìm thấy ${state.filteredKanji.size} chữ Hán",
                fontSize = 12.sp,
                color = MaterialTheme.colors.textSecondary
            )

            Text(
                text = "Đã thuộc: ${state.masteredKanjiIds.size}/${state.totalCount}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.matchaAccent
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 78.dp),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {
            items(state.filteredKanji, key = { it.id }) { kanjiItem ->
                KanjiGridCard(
                    item = kanjiItem,
                    isMastered = state.masteredKanjiIds.contains(kanjiItem.id),
                    onClick = {
                        focusManager.clearFocus()
                        viewModel.selectKanji(kanjiItem)
                    }
                )
            }
        }
    }

    // Kanji Detail Modal Dialog with Stroke Order Animation
    state.selectedKanji?.let { item ->
        KanjiDetailDialog(
            item = item,
            isMastered = state.masteredKanjiIds.contains(item.id),
            onToggleMastered = { viewModel.toggleMastered(item.id) },
            onDismiss = { viewModel.selectKanji(null) }
        )
    }
}
